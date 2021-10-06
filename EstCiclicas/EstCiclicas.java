import java.util.Scanner;
import java.util.Random;
public class EstCiclicas {
  static Scanner sc = new Scanner(System.in);//para leer valores del teclado
  private static final Random generator = new Random();
  public static int random(int min, int max){
    return min + (generator.nextInt() * (max - min));
  }
  static void contarNumMenorCeroMayorCeroWhile(){
    //Defe¡inir Variables
    int numMenEqCero=0, numMayCero=0, cantNum, numeroN;
    //Datos de Entrada
    System.out.println("Ingrese la cantidad de numeros a evaluar:");
    cantNum=sc.nextInt();
    //Proceso
    while (cantNum>=1){
      numeroN=random(-9, 9);
      System.out.println(numeroN);
      if(numeroN<=0){
        numMenEqCero++;
      }
      else{
        numMayCero++;
      }
      cantNum--;
      // code block to be excuted
    }
    //Datos de Salida
    System.out.println("Cantidad de numeros menores o iguales a cero son: "+numMenEqCero+"\nLa cantidad de numeros mayores a cero son: "+numMayCero);
  }

  public static void main(String[] args) {
    contarNumMenorCeroMayorCeroWhile();
  }
}