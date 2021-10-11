import java.util.Scanner;
public class Ejercicio_3_14 {
  static Scanner sc = new Scanner(System.in);

  static void calificacionLetra(){
    //Definir Variables
    int puntaje=0;
    String calificacion="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.14 *****");
    System.out.println("Ingrese la calificación (0/10):");
    puntaje=sc.nextInt();
    //Proceso
    switch(puntaje) {
      case 0: calificacion="F";break;
      case 1: calificacion="F";break;
      case 2: calificacion="F";break;
      case 3: calificacion="F";break;
      case 4: calificacion="F";break;
      case 5: calificacion="F";break;
      case 6: calificacion="D";break;
      case 7: calificacion="D";break;
      case 8: calificacion="C";break;
      case 9: calificacion="B";break;
      case 10: calificacion="A";break;
      default:
        calificacion="No existe";
    }
    //Datos  de salida
    System.out.println("La calificación es: "+calificacion);
  }
  
  public static void main(String[] args) {
    calificacionLetra();
  }
}