import java.util.Scanner;
public class Ejercicio_3_16 {
  static Scanner sc = new Scanner(System.in);

  static void bonoDocente(){
    //Definir Variables y otros
    double salarioMinimo, puntuacionObtenida, bonoObtenido=0.0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.16 *****");
    System.out.println("Ingrese el salario minimo:");
    salarioMinimo=teclado.nextDouble();
    System.out.println("Ingrese la puntuacion obtenida:");
    puntuacionObtenida=teclado.nextDouble();
    //Proceso

    if (puntuacionObtenida<=100 && puntuacionObtenida>=0){
      bonoObtenido=salarioMinimo;
    }else if(puntuacionObtenida >=101 && puntuacionObtenida<=150){
          bonoObtenido=salarioMinimo*2;
    }else if(puntuacionObtenida>150){
        bonoObtenido=salarioMinimo*3;    
    }
    //Datos de salida
    System.out.println("El docente obtendra un bono de:"+bonoObtenido );  
  }
  
  public static void main(String[] args) {
    bonoDocente();
  }
}