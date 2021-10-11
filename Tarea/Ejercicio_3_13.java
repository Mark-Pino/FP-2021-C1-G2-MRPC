import java.util.Scanner;
public class Ejercicio_3_13 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void viajeEstudiantes(){
    //Definir Variables
    int alumnos=0;
    double pasaje=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.13 *****");
    System.out.println("Ingresar numero de estudiantes:");
    alumnos=sc.nextInt();
    //Proceso
    if (alumnos>0 && alumnos<20){
      pasaje=70*alumnos;
    }
    else if (alumnos>=20 && alumnos<50){
      pasaje=40;
    }
    else if (alumnos>=50 && alumnos<=100){
      pasaje=35;
    }
    else {
      pasaje=20;
    }
    //Datos  de salida
    if (alumnos<=0) {
      System.out.println("No hay alumnos");
    }
    else {
      System.out.println("El pasaje cuesta: $"+pasaje);
    }
  }
  
  public static void main(String[] args) {
    viajeEstudiantes();
  }
}