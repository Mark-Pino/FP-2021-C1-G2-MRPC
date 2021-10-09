import java.util.Scanner;
public class Ejercicio_2_MRPC {
  static Scanner sc = new Scanner(System.in);

  static void bonoDesempeñoMRPC(){
    //Definir Variables
    int salario=0, puntos=0;
    double bono=0;
    //Datos de entrada
    System.out.println("********* Bono de profesores *********");
    System.out.println("Ingrese el salario minimo");
    salario=sc.nextInt();
    System.out.println("Ingrese los puntos");
    puntos=sc.nextInt();
    //Proceso
    if (puntos>=100 && puntos<=200 && salario>0) {
      bono=salario*0.10;
    }
    else if (puntos>200 && puntos<=300 && salario>0) {
      bono=salario*0.40;
    }
    else if (puntos>300 && puntos<=400 && salario>0){
      bono=salario*0.70;
    }
    else if (puntos>400 && salario>0) {
      bono=salario*0.80;
    }
    //Datos  de salida
    else if (puntos<100 && salario<0) {
      System.out.println("No tiene el salario ni los puntos necesarios para el bono");
    }
    else if (puntos<100){
      System.out.println("No tiene puntos necesarios para el bono");
    }
    else {
      System.out.println("No tiene el salario necesario para el bono ");
    }
    System.out.println("Su bono es de: "+bono);
  }

  public static void main(String[] args) {
    bonoDesempeñoMRPC();
  }
}