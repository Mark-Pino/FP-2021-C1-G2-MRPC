import java.util.Scanner;
public class Ejercicio_3_2 {
  static Scanner sc = new Scanner(System.in);

  static void sueldoSemanalTrabajador(){
    //Definir Variables
    int horaTrabajo=0, pagoHora=0;
    double sueldoSemanal=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.2 ******");
    System.out.println("Ingrese las horas de trabajo en la semana:");
    horaTrabajo=sc.nextInt();
    System.out.println("Ingrese el pago por horas:");
    pagoHora=sc.nextInt();
    //Proceso y Datos  de salida
    if (horaTrabajo>40 && pagoHora>0){
      sueldoSemanal=(pagoHora*horaTrabajo)*2;
      System.out.println("El sueldo semanal es: "+sueldoSemanal);
    }
    else if (horaTrabajo>=0 && horaTrabajo<=40 && pagoHora>0) {
      sueldoSemanal=pagoHora*horaTrabajo;
      System.out.println("El sueldo semanal es: "+sueldoSemanal);
    }
    else if (horaTrabajo<0 && pagoHora<0) {
      System.out.println("No cuenta con pago ni con horas!");
    }
    else if (horaTrabajo<0) {
      System.out.println("No tiene horas de trabajo!");
    }
    else {
      System.out.println("No tiene pago por horas!");
    }
  }
  
  public static void main(String[] args) {
    sueldoSemanalTrabajador();
  }
}