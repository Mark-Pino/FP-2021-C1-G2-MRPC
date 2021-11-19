package pe.edu.upeu;
import pe.edu.upeu.modulo.*;
import java.util.Scanner;
import pe.edu.upeu.util.*;
/**
 * Hello world!
 *
 */
public class App {

    static SubProgramas sp=new SubProgramas();
    static Recursividad re=new Recursividad();
    static Scanner sc=new Scanner(System.in);
    static LeerTeclado lt=new LeerTeclado();

static void menuOpciones(){
    int opcion=0;
    String msg="Eliga el algoritmo que desea probar"+"\n1=Factorial"

    +"\n2=Fibonaci Recur"
    +"\n3=Fibonaci no recursivo"
    ;

    opcion=lt.leer(0,msg);
    while(opcion!=0){
        switch(opcion){
            case 1:
            System.out.println(re.factorialBig(lt.leer(0, "Ingrese un numero"))); break;
            case 2:
            System.out.println(re.fibonacci(lt.leer(0, "Ingrese un numero")));
            break;
            case 3:
            System.out.println(re.fibonacciBig(lt.leer(0, "Ingrese un numero")));
            break;            

            default: System.out.println("Opcion no existe!");
        }        
      opcion=lt.leer(0,msg);
    }
  }    

    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        menuOpciones();
       
    }
    
}