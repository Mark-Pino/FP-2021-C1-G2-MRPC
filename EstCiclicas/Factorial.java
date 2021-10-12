import java.util.Scanner;
public class Factorral {
  static Scanner sc = new Scanner(System.in);

  static void factorial () {
    //Defe¡inir Variables
    int n, resultF=1;
    //Datos de Entrada
    System.out.println("Ingrese un numero para calcular el Factorial:");
    n=sc.nextInt();
    //Proceso
    if (n>1) {
      for(int i=1; i<=n; i++) {
        resultF=resultF*i;
        System.out.println("i="+i+ " resulF="+resultF);
      }
    }
    //Datos de Salida
    System.out.println("El factorial de "+n+" es: "+resultF);
  }
  
  public static void main(String[] args) {
    factorial();
  }
}