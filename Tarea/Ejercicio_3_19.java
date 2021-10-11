import java.util.Scanner;
public class Ejercicio_3_19 {
  static Scanner sc = new Scanner(System.in);

  static void tipoVacunaMRPC(){
    //Definir Variables
    String sexo="", vacuna="";
    int edad=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.19 *****");
    System.out.println("Ingrese el sexo (H/F):");
    sexo=sc.next();
    System.out.println("Ingrese la edad:");
    edad=sc.nextInt();
    //Proceso
    if (edad>=70) {
      vacuna="C";
    }
    else if (edad>=16 && edad<=69 && sexo.equals("F")) {
      vacuna="B";
    }
    else if (edad>=0 && edad<=69 && sexo.equals("H")) {
      vacuna="A";
    }
    else if (edad>=0 && edad<16 && sexo.equals("F")) {
      vacuna="A";
    }
    else {
      vacuna="Ninguna";
    }
    //Datos  de salida
    System.out.println("El tipo de vacuna que la persona debe recibir es: "+vacuna);
  }
  
  public static void main(String[] args) {
    tipoVacunaMRPC();
  }
}