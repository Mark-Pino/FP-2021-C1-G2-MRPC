import java.util.Scanner;
import java.io.Console;
public class Password {
  static Scanner sc = new Scanner(System.in);

  static void validarContrasenha(){
    //definicion de variables
    String mensaje, password, usuario, msgrespuesta="";
    int contador=1;
    //datos de entrada
    System.out.println("Ingrese su Usuario:");
    usuario=sc.next();
    Console console = System.console();
    //Proceso
    do{
      //System.out.println("Ingrese su Password:");
      //password=sc.next();        
      char[] passwordArray = console.readPassword("Ingrese su Password:");  
      if((String.valueOf(passwordArray)).equals("123456d")){
        msgrespuesta="En hora buena";
        System.out.println(msgrespuesta);  
        //contador=4;
        break;
      }else if(contador<3){
        msgrespuesta="lo siento password equivocado!";
        System.out.println(msgrespuesta);        
        // contador=contador+1;
      }else{
        msgrespuesta="oportunidades Agotadas";    
        System.out.println(msgrespuesta);     
      }
    contador++;
    }while(contador<=3);
    //Datos de salida
    //System.out.println(msgrespuesta);
  }

  public static void main(String[] args) {
    validarContrasenha();
  }
}