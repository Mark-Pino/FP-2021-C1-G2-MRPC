package pe.edu.upeu.app;

import pe.edu.upeu.dao.UsuarioDao;
import pe.edu.upeu.util.LeerTeclado;

public class MenuPrincipal {
    LeerTeclado leer=new LeerTeclado();
    UsuarioDao userDao;

    public MenuPrincipal(){ menuMain();  }
     
    public void menuMain(){
        int opcion=0;
        System.out.println("===================== Bienvenidos al Sistema ==================");
        String msg="Seleccione una opcion"+
        "\n1=Nuevo usuario"
        +"\n2=Lista Usuario";
        opcion=leer.leer(0,msg);
        while(opcion!=0){
            switch(opcion){
                case 1:{
                    userDao=new UsuarioDao();
                    userDao.registrarNuevoUsuario();
                } break;
                case 2:{
                    userDao=new UsuarioDao();
                    userDao.listarUsuarios();
                } break;

                default: System.out.println("Opcion no existe!");
            }   
          opcion=leer.leer(0,msg);
        }
    }
}