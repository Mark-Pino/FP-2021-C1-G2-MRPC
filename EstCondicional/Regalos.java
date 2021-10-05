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
  static void pagoPolizas(){
    //Defe¡inir Variables
    String plan, alcohol, lentes, enfermedad;
    int edad;
    double costoPago, recargos=0;
    //Datos de Entrada
    System.out.println("Ingrese el plan (A/B): ");
    plan=sc.next();
    System.out.println("Consume alcohol? (S/N): ");
    alcohol=sc.next();
    System.out.println("Usa lentes? (S/N): ");
    lentes=sc.next();
    System.out.println("Tiene alguna enfermedad? (S/N): ");
    enfermedad=sc.next();
    System.out.println("Ingrese su edad: ");
    edad=sc.nextInt();
    //Proceso
    if (alcohol.equals("S")){
      recargos+=0.10;
    }
    if (lentes.equals("S")){
      recargos+=0.5;
    }
    if (enfermedad.equals("S")){
      recargos+=0.5;
    }
    if (edad>40){
      recargos+=0.20;
    }
    else {
      recargos+=0.10;
    }
    if (plan.equals("A")){
      costoPago=1200+1200*recargos;
    }
    else {
      costoPago=950+950*recargos;
    }
    //Datos de Salida
    System.out.println("Ud. debe pagar el monto de: "+costoPago);
  }
  static void mesdelAnho(){
    //Declarar Variables
    int mesNum; 
    String mesLetra="";
    //Datos de entrada
    System.out.println("Ingrese el numero del mes entre 1-12:");
    mesNum=sc.nextInt();
    //Proceso
    switch(mesNum){
      case 1:  mesLetra="Enero"; break;
      case 2:  mesLetra="Febrero"; break;
      case 3:  mesLetra="Marzo"; break;
      case 4:  mesLetra="Abril"; break;
      case 5:  mesLetra="Mayo"; break;
      case 6:  mesLetra="Junio"; break;
      case 7:  mesLetra="Julio"; break;
      case 8:  mesLetra="Agosto"; break;
      case 9:  mesLetra="Septiembre"; break;
      case 10:  mesLetra="Octubre"; break;
      case 11:  mesLetra="Noviembre"; break;
      case 12:  mesLetra="Diciembre"; break;
      default: 
      mesLetra="No existe";
      System.out.println("El mes no es valido!");break;
    }
    //Datos de salida
    System.out.println("El mes "+mesNum+" es: "+mesLetra);
  }

  public static void main(String[] args) {
    algoritmoRegalos();
    pagoPolizas();
    mesdelAnho();
  }
}