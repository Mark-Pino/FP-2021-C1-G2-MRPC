import java.util.Scanner;
public class Ejercicio_3_15 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void mostrarDiaLetras(){
    //Definir variables
    int dia=0;
    String nombredia="";
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.15 *****");
    System.out.println("Ingrese un dia de la semana entre (1-7):");
    dia=sc.nextInt();
    //Proceso
    switch(dia) {
      case 1: nombredia="Domingo";break;
      case 2: nombredia="Lunes";break;
      case 3: nombredia="Martes";break;
      case 4: nombredia="Miercoles";break;
      case 5: nombredia="Jueves";break;
      case 6: nombredia="Viernes";break;
      case 7: nombredia="Sabado";break;
      default:
        nombredia="No existe";
    }
    //Datos de Salida
    System.out.println("El dia es: "+nombredia);
  }
  
  public static void main(String[] args) {
    mostrarDiaLetras();
  }
}