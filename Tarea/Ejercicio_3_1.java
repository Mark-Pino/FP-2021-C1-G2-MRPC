import java.util.Scanner;
public class Ejercicio_3_1 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void votoElecciones(){
    //Definir Variables
    int edad=0;
    String voto="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.1 ******");
    System.out.println("Ingrese la edad:");
    edad=sc.nextInt();
    //Proceso
    if (edad>=18){
      voto="Puede votar";
    }
    else if (edad>=0 && edad<18){
      voto="No puede votar";
    }
    else {
      voto="No tiene edad";
    }
    //Datos  de salida
    System.out.println("Ud. "+voto);
  }
  
  public static void main(String[] args) {
    votoElecciones();
  }
}