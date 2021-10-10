import java.util.Scanner;
public class Ejercicio_3_4 {
  static Scanner sc = new Scanner(System.in);

  static void cobrarEstacionamiento(){
    //Definir Variables
    int horas=0;
    double pagoHoras=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.4 ******");
    System.out.println("Ingrese la cantidad de horas:");
    horas=sc.nextInt();
    //Proceso
    if (horas>0 && horas<=2){
      pagoHoras=5.00;
    }
    else if (horas>2 && horas<=5){
      pagoHoras=4.00;
    }
    else if (horas>5 && horas<=10){
      pagoHoras=3.00;
    }
    else if (horas>10){
      pagoHoras=2.00;
    }
    //Datos  de salida
    if (horas<0){
      System.out.println("No cuenta con horas!");
    }
    else {
      System.out.println("El precio es: $"+pagoHoras+" c/u.");
    }
  }
  
  public static void main(String[] args) {
    cobrarEstacionamiento();
  }
}