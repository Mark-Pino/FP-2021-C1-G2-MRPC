import java.util.Scanner;
public class Ejercicio_3_6 {
  static Scanner sc = new Scanner(System.in);

  static void descuentoCosto(){
    //Definir Variables
    int costo=0;
    double descuento=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.6 ******");
    System.out.println("Ingrese el costo:");
    costo=sc.nextInt();
    //Proceso
    if (costo>0 && costo<100) {
      descuento=costo-(costo*0.10);
    }
    else if (costo>=100 && costo<200){
      descuento=costo-(costo*0.12);
    }
    else if (costo>=200) {
      descuento=costo-(costo*0.15);
    }
    //Datos  de salida
    if (costo<0) {
      System.out.println("Ingrese bien los datos");
    }
    else {
    System.out.println("El descuento es: "+descuento);
    }
  }
  
  public static void main(String[] args) {
    descuentoCosto();
  }
}