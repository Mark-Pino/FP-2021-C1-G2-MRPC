import java.util.Scanner;
public class Regalos {
  static Scanner sc = new Scanner(System.in);

  static void algoritmoRegalos(){
    //Defe¡inir Variables
    double monto=0;
    String regalo="";
    //Datos de Entrada
    System.out.println("Ingrese el monto que dispone: ");
    monto=sc.nextDouble();
    //Proceso
    if (monto>=1 && monto<=10.00) {
      regalo="\n-Targeta";
    }
    else if (monto>=11.00 && monto<=100.00) {
      regalo="\n-Chocolates\n-Targeta";
    }
    else if (monto>=101.00 && monto<=250.00) {
      regalo="\n-Flores\n-Chocolates\n-Targeta";
    }
    else if (monto>250){
      regalo="\n-Anillo\n-Flores\n-Chocolates\n-Targeta";
    }
    else {
      regalo="\nNinguno";
    }
    //Datos de Salida
    System.out.println("Ud. puede elegir los siguientes: "+regalo);
  }

  public static void main(String[] args) {
    algoritmoRegalos();
  }
}