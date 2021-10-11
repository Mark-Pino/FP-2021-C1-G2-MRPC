import java.util.Scanner;
public class Ejercicio_3_21 {
  static Scanner sc = new Scanner(System.in);

  static void sueldoBanco(){
    //Definir Variables
    int prueba=0;
    double prueba1=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.21 *****");
    System.out.println(":");
    prueba=sc.nextInt();
    //Proceso
    if (prueba==1){
      prueba1=1+1;
    }
    //Datos  de salida
    System.out.println(": "+prueba1);
  }
  
  public static void main(String[] args) {
    sueldoBanco();
  }
}