package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class UsuarioDao extends AppCrud {
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();

    LeerArchivo leerArch;
    UsuarioTO userTO;
    final String TABLE_USER="Usuario.txt";
    
    public void registrarNuevoUsuario() {    
        userTO=new UsuarioTO();
        userTO.setUsuario(leerTecla.leer("", "Ingrese el nuevo usuario:"));//color
        userTO.setPassword(leerTecla.leer("", "Ingrese la contraseña:"));//color
        userTO.setPerfil(leerTecla.leer("", "Ingrese un perfil (VENDEDOR/ADMINISTRADOR):"));//color
        leerArch=new LeerArchivo(TABLE_USER);
        agregarContenido(leerArch, userTO);
        System.out.println("");
    }
    
    public void listarUsuarios(){
        leerArch=new LeerArchivo(TABLE_USER);
        Object[][] data=listarContenido(leerArch);
        util.pintarLine('H', 25);
        util.pintarTextHeadBody('H', 4, "Usuario,Password,Perfil");
        System.out.println("");
        util.pintarLine('H', 25);
        String dataPrint="";
        for (int i = 0; i < data.length; i++) {
            dataPrint=data[i][0]+","+data[i][1]+","+data[i][2];
            util.pintarTextHeadBody('B', 4, dataPrint); 
        }
        util.pintarLine('H', 25);
        System.out.println("");
    }
    
    public boolean login() {    
        String usuario=leerTecla.leer("","Usuario:");//color
        Console cons=System.console();
        System.out.print("Contraseña: ");//color
        char[] clave=cons.readPassword();
        System.out.println();
        leerArch=new LeerArchivo(TABLE_USER);
        Object[][] dataUser= buscarContenido(leerArch, 0, usuario);    
        if(dataUser!=null){
            if(String.valueOf(dataUser[0][1]).equals(String.valueOf(clave))){
                return true;
            }else{
                System.out.println("La contraseña es incorrecta");//color
                return login();
            }
        }else{
            System.out.println("Intenete Nuevamente:");//color
            return login();
        }
    }
}