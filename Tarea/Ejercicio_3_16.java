import java.util.Scanner;
public class Ejercicio_3_16 {
  static Scanner sc = new Scanner(System.in);
  //Nombres y Apellidos: Mark Roger Pino Chata
  //Codigo: 202100418
  //Ciclo: 1 Grupo: 2
  static void bonoDocente(){
    //Definir Variables y otros
    int salarioMinimo=0, puntuacionObtenida=0;
    double bonoObtenido=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.16 *****");
    System.out.println("Ingrese el salario minimo:");
    salarioMinimo=sc.nextInt();
    System.out.println("Ingrese la puntuacion obtenida:");
    puntuacionObtenida=sc.nextInt();
    //Proceso
    if (puntuacionObtenida<=100 && puntuacionObtenida>=0){
      bonoObtenido=salarioMinimo;
    }
    else if(puntuacionObtenida >=101 && puntuacionObtenida<=150){
      bonoObtenido=salarioMinimo*2;
    }
    else if(puntuacionObtenida>150){
      bonoObtenido=salarioMinimo*3;    
    }
    //Datos de salida
    System.out.println("El docente obtendra un bono de:"+bonoObtenido );  
  }
  
  public static void main(String[] args) {
    bonoDocente();
  }
}