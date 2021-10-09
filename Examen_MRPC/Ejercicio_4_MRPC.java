import java.util.Scanner;
public class Ejercicio_4_MRPC{
  static Scanner sc = new Scanner(System.in);

  static void calcOperAritMRPC(){
    //Definir Variables
    double valor1=0, valor2=0, calcValores=0;
    String signo="";
    //Datos de entrada
    System.out.println("****** Operacion de 2 valores ********");
    System.out.println("Ingrese el primer valor");
    valor1=sc.nextDouble();
    System.out.println("Ingrese el segundo valor");
    valor2=sc.nextDouble();
    System.out.println("Ingrese cualquiera de estos signos\n+ = Suma\n- = Resta\n/ = División\n* = Multiplicación\n^ = Potencia");
    signo=sc.next();
    //Proceso
    if (signo.equals("+")) {
      calcValores=valor1+valor2;
    }
    else if (signo.equals("-")) {
      calcValores=valor1-valor2;
    }
    else if (signo.equals("/")) {
      calcValores=valor1/valor2;
    }
    else if (signo.equals("*")) {
      calcValores=valor1*valor2;
    }
    else if (signo.equals("^")) {
      calcValores=Math.pow(valor1, valor2);
    }
    else {
      System.out.println("Ingrese bien el signo");
    }
    //Datos  de salida
    System.out.println("El resultado es: "+calcValores);
  }

  public static void main(String[] args) {
    calcOperAritMRPC();
  }
}