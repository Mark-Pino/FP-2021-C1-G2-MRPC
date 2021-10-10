import java.util.Scanner;
public class Ejercicio_3_10 {
  static Scanner sc = new Scanner(System.in);

  static void lugarViaje(){
    //Definir Variables
    int dinero=0, cobroKilometro=0;
    double costo=0, mexico=750, pv=800, acapulco=1200, cancun=1800;
    String destino="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.10 *****");
    System.out.println("Ingrese su presupuesto:");
    dinero=sc.nextInt();
    System.out.println("Ingrese el cobro por kilometro:");
    cobroKilometro=sc.nextInt();
    //Proceso
    if (dinero>=0 && cobroKilometro>=0){ //Definir y calcular el precio del viaje y los lugares
      costo=dinero*cobroKilometro;
      mexico=mexico*cobroKilometro*2;
      pv=pv*cobroKilometro*2;
      acapulco=acapulco*cobroKilometro*2;
      cancun=cancun*cobroKilometro*2;
    }
    if (costo>=mexico && costo<pv) {//Calculando el destino del viaje
      destino="\n-Mexico";
    }
    else if (costo>=pv && costo<acapulco) {
      destino="\n-Mexico\n-P.V.";
    }
    else if (costo>=acapulco && costo<cancun) {
      destino="\n-Mexico\n-P.V.\n-Acapulco";
    }
    else if (costo>=cancun) {
      destino="\n-Mexico\n-P.V.\n-Acapulco\n-Cancún";
    }
    //Datos  de salida
    if (dinero<0) {
      System.out.println("Ingrese bien el presupuesto");
    }
    else if(cobroKilometro<0) {
      System.out.println("Ingrese bien el cobro por kilometro");
    }
    else if (costo<mexico) {
      System.out.println("No puede viajar, quedese en casa");
    }
    else {
      System.out.println("Podria ir a: "+destino);
    }
  }
  
  public static void main(String[] args) {
    lugarViaje();
  }
}