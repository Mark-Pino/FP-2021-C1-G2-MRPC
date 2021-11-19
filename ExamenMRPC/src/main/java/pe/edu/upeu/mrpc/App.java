package pe.edu.upeu.mrpc;
import pe.edu.upeu.mrpc.examen_mrpc.ResolucionExamenMRPC;
import pe.edu.upeu.mrpc.utils.*;
import java.util.Scanner;

public class App {

  public static ResolucionExamenMRPC re;
  static Scanner sc=new Scanner(System.in);
  static LeerTeclado br=new LeerTeclado();

  static void menuOpciones(){
    re=new ResolucionExamenMRPC();
    int opcion=0;
    String msg="********** ¿Que ejercicio desea probar? **********\n1 = Ejercicio 2\n2 = Ejercicio 3\n3 = Ejercicio 4\n4 = Ejercicio 5\n0 = Salir del menú";
    opcion=br.leer(0,msg);
    while(opcion!=0){
      switch(opcion){
        case 1:re.impuestoPagarAutomotriz(); break;
        case 2:re.multiplicarNumeroEntero(); break;
        case 3:re.determinarNumerosPerfectos(); break;
        case 4:re.Potenciación(); break;
        default: System.out.println("La opcion no existe!");
      }
      opcion=br.leer(0,msg);
    }
  }
  public static void main( String[] args ){
    menuOpciones();
  }
}