import java.util.Scanner;
public class Ejercicio_3_18 {
  static Scanner sc = new Scanner(System.in);

  static void bonoNavideño(){
    //Definir Variables
    int antiguedad=0, sueldo=0;
    double bono=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.18 *****");
    System.out.println("Ingrese los años de antiguedad:");
    antiguedad=sc.nextInt();
    System.out.println("Ingrese el sueldo:");
    sueldo=sc.nextInt();
    //Proceso
    if (antiguedad>=4){
      bono=sueldo*0.25;
    }
    else {
      bono=sueldo*0.20;
    }
    if (sueldo<2000){
      bono=sueldo*0.25;
    }
    else {
      bono=sueldo*0.20;
    }
    //Datos  de salida
    if (antiguedad<0) {
      System.out.println("Ingrese bien los años");
    }
    else if (sueldo<0) {
      System.out.println("Ingrese bien el sueldo");
    }
    else
    System.out.println("Su bono navideño es de: "+bono);
  }
  
  public static void main(String[] args) {
    bonoNavideño();
  }
}