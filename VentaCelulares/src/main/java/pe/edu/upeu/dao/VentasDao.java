package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.modelo.DescuentoTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class VentasDao extends AppCrud {
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    
    LeerArchivo leerArch;
    ProductoTO prodTO;
    ClienteTO cliTO;
    VentaTO ventTO;
    VentaDetalleTO vdTO;
    DescuentoTO desTO;
    
    final String TABLE_PRODUCTO="Producto.txt";   
    final String TABLE_CLIENTE="Cliente.txt";   
    final String TABLE_VENTA="Venta.txt";   
    final String TABLE_DETALLE_VENTA="VentaDetalle.txt";  
    
    SimpleDateFormat formatofechahora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");

    public void registroVenta() {
        
        System.out.println("******************* Venta de Celulares ***************");//color
        String dni=crearCliente(leerTecla.leer("", "Ingrese el DNI del Cliente:"));//color
        double igvX=0;
        double subtotalX=0;
        double importeTotalX=0;

        VentaTO ventaTO=crearVenta(dni);
        if (ventaTO!=null) {
            String opcion="SI";
            do {                
                VentaDetalleTO vdXTo=crearCarritoVenta(ventaTO);
                importeTotalX+=vdXTo.getPrecioUnit();
                opcion=leerTecla.leer("", "Desea agregar mas productos al carrito de ventas? (SI/NO):");//color
            } while (opcion.toUpperCase().equals("SI"));
            subtotalX=(importeTotalX*100)/118;
            igvX=subtotalX*0.18;

            leerArch=new LeerArchivo(TABLE_VENTA); 
            ventaTO.setSubTotal(subtotalX);
            ventaTO.setIgv(igvX);
            ventaTO.setImporteTotal(importeTotalX);
            editarRegistro(leerArch, 0, ventTO.getIdVenta(), ventaTO);
        }
    }

    public VentaTO crearVenta(String dni) {
        leerArch=new LeerArchivo(TABLE_VENTA);        
        ventTO=new VentaTO();
        ventTO.setIdVenta(generarId(leerArch, 0, "V", 1));
        ventTO.setDni(dni);
        ventTO.setFecha(formatofechahora.format(new Date()));
        ventTO.setUsuario("anonimo");
        ventTO.setIgv(0);
        ventTO.setImporteTotal(0);
        ventTO.setSubTotal(0);
        leerArch=new LeerArchivo(TABLE_VENTA);
        agregarContenido(leerArch, ventTO);
        return ventTO;
    }
    
    public VentaDetalleTO crearCarritoVenta(VentaTO vto) {
        util.clearConsole();
        System.out.println("==================== Carrito de Ventas =====================");//color
        mostrarProducto();
        leerArch=new LeerArchivo(TABLE_DETALLE_VENTA);
        vdTO=new VentaDetalleTO();
        vdTO.setIdVentaDetalle(generarId(leerArch, 0, "VD", 2));
        vdTO.setIdVenta(vto.getIdVenta());
        vdTO.setIdProducto(leerTecla.leer("", "Ingrese el Id del Producto a vender:"));//color   
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        Object[][] dataP= buscarContenido(leerArch, 0, vdTO.getIdProducto());
        double precioP=Double.parseDouble(String.valueOf(dataP[0][3]));
        String IMEIX=dataP[0][6].toString();
        vdTO.setPrecioUnit(precioP);
        vdTO.setCodigoIMEI(IMEIX);
        leerArch=new LeerArchivo(TABLE_DETALLE_VENTA);
        agregarContenido(leerArch, vdTO);
        return vdTO;
    }

    public void mostrarProducto() {
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        Object[][] dataPro= listarContenido(leerArch);
        for (int i = 0; i < dataPro.length; i++) {
            System.out.print(dataPro[i][0]+"="+dataPro[i][1]+
            " (Precio:"+(
            Double.parseDouble(String.valueOf(dataPro[i][3])) + 
            Double.parseDouble(String.valueOf(dataPro[i][5])))+"\t ! " );//color
       }
       System.out.println("\n");
    }   
    
    public String crearCliente(String dni) {
        leerArch=new LeerArchivo(TABLE_CLIENTE);
        Object[][] datCli= buscarContenido(leerArch, 0, dni);
        if(datCli!=null){
            return dni;
        }else{
            leerArch=new LeerArchivo(TABLE_CLIENTE);
            cliTO=new ClienteTO();
            cliTO.setDni(dni);
            cliTO.setNombre(leerTecla.leer("", "Ingrese el nombre del cliente:"));//color
            agregarContenido(leerArch, cliTO);
            return cliTO.getDni();
        }       
    }
    
    public void ReporteVentasRangoFecha() {
        util.clearConsole();
        leerArch=new LeerArchivo(TABLE_VENTA);
        Object[][] datPrev= listarContenido(leerArch);
        String fechaInit=leerTecla.leer("", "Ingrese la fecha de inicio:");//color
        String fechaFinal=leerTecla.leer("", "Ingrese la fecha del final:");//color
        int cantidadFilas=0;
        try { //Leer ventas y saber cuantos coinciden eon el rango de fechas
            for (int i = 0; i < datPrev.length; i++) {
                String[] tempFecha=String.valueOf(datPrev[i][2]).split(" ");
                Date fechaTemX=formatofecha.parse(tempFecha[0]);
                if (
                    (fechaTemX.after(formatofecha.parse(fechaInit)) || tempFecha[0].equals(fechaInit)) && 
                    (fechaTemX.before(formatofecha.parse(fechaFinal)) || tempFecha[0].equals(fechaFinal))
                ) {
                    cantidadFilas++;
                }
            }  
            // pasar la data a la nueva matriz
            VentaTO[] dataVentas=new VentaTO[cantidadFilas];
            int indiceVentorV=0;
            for (int i = 0; i < datPrev.length; i++) {
                String[] tempFecha=String.valueOf(datPrev[i][2]).split(" ");
                Date fechaTemX=formatofecha.parse(tempFecha[0]);
                if (
                    (fechaTemX.after(formatofecha.parse(fechaInit)) || tempFecha[0].equals(fechaInit)) && 
                    (fechaTemX.before(formatofecha.parse(fechaFinal)) || tempFecha[0].equals(fechaFinal))
                ) {
                    VentaTO vtOX=new VentaTO();
                    vtOX.setIdVenta(String.valueOf(datPrev[i][0]));
                    vtOX.setDni(String.valueOf(datPrev[i][1]));
                    vtOX.setFecha(String.valueOf(datPrev[i][2]));
                    vtOX.setUsuario("Anonimo");
                    vtOX.setSubTotal(Double.parseDouble(String.valueOf(datPrev[i][3])));
                    vtOX.setIgv(Double.parseDouble(String.valueOf(datPrev[i][4])));
                    vtOX.setImporteTotal(Double.parseDouble(String.valueOf(datPrev[i][5])));
                    dataVentas[indiceVentorV]=vtOX;
                    indiceVentorV++;
                }
            }
            AnsiConsole.systemInstall();  
            Ansi color=new Ansi();            
            //Imprimir Reporte
            System.out.println(color.render("@|blue ================================ Reporte Ventas ===============================|@"));//color
            System.out.println("***************** Fecha Inicio:"+fechaInit+" a Fecha Fin:"+fechaFinal+" **************");//color
            util.pintarLine('H', 39);
            util.pintarTextHeadBody('H', 3, "ID,DNI,Fech.Venta,SubTotal, IGV, Imp. Total");//color
            System.out.println();
            util.pintarLine('H', 39);
            double subtotX=0, igvX=0, impTotX=0;
            for (VentaTO xx : dataVentas) {
                String dataXX=xx.getIdVenta()+","+xx.getDni()+","+xx.getFecha()
                +","+xx.getSubTotal()+","+xx.getIgv()+","+xx.getImporteTotal();
                subtotX+=xx.getSubTotal();
                igvX+=xx.getIgv();
                impTotX+=xx.getImporteTotal();
                util.pintarTextHeadBody('B',3,dataXX);
            }  //Math.round(double*100.0)/100.0
            util.pintarLine('H', 39);
            color=new Ansi();   
            //System.out.println(color.render("@|blue Holasss |@ @|green VErsdsd |@  "));       
            System.out.println(color.render("      @|red Sub. Total: S/.|@ @|green "+ (Math.round(subtotX*100.0)/100.0)+
            "|@ | @|blue IGV: S/.|@ @|green "+(Math.round(igvX*100.0)/100.0)+
            "|@ |  @|blue Imp. Total: S/. |@ @|green "+(Math.round(impTotX*100.0)/100.0)+"|@"));//color
            util.pintarLine('H', 39);
        } catch (Exception e) {
            System.err.println("Error al reportar ventas: "+e.getMessage());//color
        }
    }
}