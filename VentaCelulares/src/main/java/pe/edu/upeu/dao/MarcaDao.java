package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.MarcaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class MarcaDao extends AppCrud {
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();

    LeerArchivo leerArch;
    MarcaTO marTO;
    final String TABLE_MARCA="Marca.txt";

    public void mostrarMarca() {
        leerArch=new LeerArchivo(TABLE_MARCA);
        Object[][] dataMar=listarContenido(leerArch);
        if (dataMar!=null) {
            for (int i = 0; i < dataMar.length; i++) {
                System.out.println(dataMar[i][0]+"="+dataMar[i][1]);
            }
        }
        System.out.println("\n");
    }
    
    public void createMarca() {
        leerArch=new LeerArchivo(TABLE_MARCA);
        marTO=new MarcaTO();
        marTO.setIdMarca(generarId(leerArch, 0, "M", 1));
        marTO.setNombre(leerTecla.leer("", "Ingrese el nombre de la marca: "));//color
        leerArch=new LeerArchivo(TABLE_MARCA);
        agregarContenido(leerArch, marTO);
        System.out.println("");
    }  
}