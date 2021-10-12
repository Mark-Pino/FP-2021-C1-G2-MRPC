import java.util.Scanner;
public class Suma_de_numeros {
  static Scanner sc = new Scanner(System.in);

  static void sumaParesRangoAB(){
    //definir variables y datos de entrada
    System.out.println("Ingrese valor  Inicial A:");
    int a=sc.nextInt();
    System.out.println("Ingrese valor final B:");
    int b=sc.nextInt();
    int suma=0;
    //Proceso
    for(int i=a; i<=b; i++){
      if(i%2==0){
          suma=suma+i;
      }      
    }
    //datos de salida
    System.out.println("La suma de numeros pares es:"+suma);

  }

  public static void main(String[] args) {
    sumaParesRangoAB();
  }
}