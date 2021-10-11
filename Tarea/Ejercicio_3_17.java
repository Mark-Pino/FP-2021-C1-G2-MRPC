import java.util.Scanner;
public class Ejercicio_3_17 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void paquetes(){
    //Definir Variables
    double monto=0;
    String regalo="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.17 *****");
    System.out.println("Ingrese el monto que recibe en diciembre:");
    monto=sc.nextDouble();
    //Proceso
    if (monto>=50000){
      regalo="A";
    }
    else if (monto<50000 && monto>=20000){
      regalo="B";
    }
    else if (monto<20000 && monto>=10000){
      regalo="C";
    }
    else if (monto<10000 && monto>0){
      regalo="D";
    }
    //Datos  de salida
    System.out.println("El paquete que puede comprar es: "+regalo);
  }
  
  public static void main(String[] args) {
    paquetes();
  }
}