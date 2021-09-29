import java.util.Scanner;
public class Poliza {
  static Scanner sc = new Scanner(System.in);
  
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

  public static void main(String[] args) {
    pagoPolizas();
  }
}