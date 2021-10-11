import java.util.Scanner;
public class Ejercicio_3_20 {
  static Scanner sc = new Scanner(System.in);

  static void fabricaPantalones(){
    //Definir Variables
    int numeroPantalones=0, costoTelaA=0, costoTelaB=0, tipoPantalon=0;
    double recargo=0, precioFinal=0, precioPantalon=0, gananciasTienda=0, gananciasPantalones=0;
    String tipoTela="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.20 *****");
    System.out.println("Ingrese numero de pantalones:");
    numeroPantalones=sc.nextInt();
    System.out.println("Ingrese el tipo de pantalon (30/32/36):");
    tipoPantalon=sc.nextInt();
    System.out.println("Ingrese el modelo que desea hacer (A/B):");
    tipoTela=sc.next();
    if (tipoTela.equals("A")) {
      System.out.println("Ingrese el costo de la tela A 1.50m:");
      costoTelaA=sc.nextInt();
    }
    else {
      System.out.println("Ingrese el costo de la tela B 1.80m:");
      costoTelaB=sc.nextInt();
    }
    //Proceso 
    if (tipoTela.equals("A")) {
      recargo+=numeroPantalones/(costoTelaA*0.80);
    }
    else {
      recargo+=numeroPantalones/(costoTelaB*0.95);
    }
    if (tipoPantalon==32 || tipoPantalon==36) {
      recargo+=recargo+0.4;
    }
    if (tipoTela.equals("A")){
      precioFinal=numeroPantalones*(recargo+0.30);
    }
    else {
      precioFinal=numeroPantalones*(recargo+0.30);
    }
    gananciasTienda=precioFinal/recargo+0.30;
    gananciasPantalones=gananciasTienda/numeroPantalones;
    precioPantalon=precioFinal/numeroPantalones;
    //Datos  de salida
    System.out.println("El precio final es: $"+precioFinal+"\nEl precio por pantalon: $"+precioPantalon+"\nLa ganancia de la tienda es: $"+gananciasTienda+"\nLa ganacia por pantalon de la tienda: $"+gananciasPantalones);
  }
  
  public static void main(String[] args) {
    fabricaPantalones();
  }
}