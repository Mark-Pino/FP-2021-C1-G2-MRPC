import java.util.Scanner;
public class Ejercicio_3_7 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void becaPresEst(){
    //Declaracion de variables e inicializacion
    int edad=0;
    double promedio=0, montoBeca=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.7 ******");
    System.out.println("Ingrese su edad:");
    edad=sc.nextInt();
    System.out.println("Ingrese su promedio de nota:");
    promedio=sc.nextDouble();    
    //Proceso
    if(edad>18){
      if(promedio>=9){
        montoBeca=2000;
      }else if(promedio>=7.5 && promedio<9){
        montoBeca=1000;
      }else if(promedio>=6 && promedio<7.5){
        montoBeca=500;
      }else{
        montoBeca=0;
      }
    }else{
      if(promedio>=9){
        montoBeca=3000;
      }else if(promedio>=8 && promedio<9){
        montoBeca=2000;
      }else if(promedio<8 && promedio>=6){
        montoBeca=100;
      }else{
        montoBeca=0;
      }
    }
    //Datos Salida
    if(montoBeca==0){
      System.out.println("Esforzarse para el proximo ciclo...!");
    }else{
      System.out.println("Felicitaciones Ud. es acreedor de una Beca por el Monto de: $"+montoBeca);
    }

  }
  
  public static void main(String[] args) {
    becaPresEst();
  }
}