import java.util.Scanner;
public class Ejercicio_3_12 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void sueldoSemanalTrabajador(){
    //Definir Variables
    int horaTrabajo=0, pagoHora=0;
    double sueldoSemanal=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.12 *****");
    System.out.println("Ingrese las horas de trabajo en la semana:");
    horaTrabajo=sc.nextInt();
    System.out.println("Ingrese el pago por hora:");
    pagoHora=sc.nextInt();
    //Proceso
    if (horaTrabajo>0 && horaTrabajo<=40 && pagoHora>0){
      sueldoSemanal=(pagoHora*horaTrabajo);
    }
    else if (horaTrabajo>=41 && horaTrabajo<=45 && pagoHora>0) {
      sueldoSemanal=(pagoHora*horaTrabajo)*2;
    }
    else if (horaTrabajo>=46 && horaTrabajo<=50 && pagoHora>0) {
      sueldoSemanal=(pagoHora*horaTrabajo)*3;
    }
    //Datos de salida
    if (horaTrabajo==50 && pagoHora>0) {
      System.out.println("Ya no puede trabajar mas");
    }
    if (horaTrabajo>50 && pagoHora>0) {
      System.out.println("No puede trabajar mas de 50 horas solo se contara las 50 horas");
      sueldoSemanal=(pagoHora*50)*3;
      System.out.println("Su sueldo semanal es de: "+sueldoSemanal);
    }
    else if (horaTrabajo<=0 && pagoHora<=0) {
      System.out.println("No cuenta con pago ni con horas!");
    }
    else if (horaTrabajo<=0) {
      System.out.println("No tiene horas de trabajo!");
    }
    else if (pagoHora<=0) {
      System.out.println("No tiene pago por hora!");
    }
    else {
      System.out.println("Su sueldo semanal es de: "+sueldoSemanal);
    }
  }
  
  public static void main(String[] args) {
    sueldoSemanalTrabajador();
  }
}