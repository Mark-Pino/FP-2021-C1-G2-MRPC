import java.util.Scanner;
public class Ejercicio_4_9 {
  static Scanner sc=new Scanner(System.in);

  public static void deposito() {
    //definir variables
    double cantidad=0;
    int cantaños=0, contador=1;
    //datos de entrada
    System.out.println("***** Ejercicio 4.9 ******");
    System.out.println("Ingrese cuantos años ingreso dinero:");
    cantaños=sc.nextInt();
    //Proceso y datos de salida
    while (contador<=cantaños) {
      System.out.println("Indique la cantidad de dinero que ingreso el año "+contador+":");
      cantidad=sc.nextInt();
      cantidad=(cantidad*0.1)+cantidad;
      contador++;
    }
    System.out.println("Para el año "+cantaños+" ahorro: "+cantidad);
  }
  
  public static void main(String[] args) {
    deposito();
  }
}