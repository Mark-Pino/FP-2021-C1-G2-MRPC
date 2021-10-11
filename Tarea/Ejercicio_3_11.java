import java.util.Scanner;
public class Ejercicio_3_11 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void bonoAntiguedad(){
    //Definir Variables
    int antiguedad=0, bono=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.11 *****");
    System.out.println("Ingrese la antiguedad de trabajando en la tienda:");
    antiguedad=sc.nextInt();
    //Proceso
    if (antiguedad==1){
      bono=100;
    }
    else if (antiguedad==2){
      bono=200;
    }
    else if (antiguedad==3){
      bono=300;
    }
    else if (antiguedad==4){
      bono=400;
    }
    else if (antiguedad==5){
      bono=500;
    }
    else if (antiguedad>5){
      bono=1000;
    }
    //Datos  de salida
    if (antiguedad==0) {
      System.out.println("No cuenta con la suficiente antiguedad de trabajo");
    }
    else if (antiguedad<0) {
      System.out.println("Ingrese bien la antiguedad");
    }
    else {
      System.out.println("Su bono es de: $"+bono);
    }
  }
  
  public static void main(String[] args) {
    bonoAntiguedad();
  }
}