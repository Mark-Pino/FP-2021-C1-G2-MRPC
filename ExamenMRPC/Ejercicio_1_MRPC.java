import java.util.Scanner;
public class Ejercicio_1_MRPC {
  static Scanner sc = new Scanner(System.in);

  static void promedioAlumnoMRPC(){
    //Definir Variables
    int nota1=0, nota2=0, nota3=0;
    double promedioFinal=0;
    //Datos de entrada
    System.out.println("*****Calcular el promedio final*****");
    System.out.println("Ingrese la nota del primer examen:");
    nota1=sc.nextInt();
    System.out.println("Ingrese la nota del segundo examen:");
    nota2=sc.nextInt();
    System.out.println("Ingrese la nota del tercer examen:");
    nota3=sc.nextInt();
    //Proceso
    if (nota1>=0 && nota1<=20 && nota2>=0 && nota2<=20 && nota3>=0 && nota3<=20){
      promedioFinal=(nota1*0.25)+(nota2*0.25)+(nota3*0.50);
    //Datos  de salida
      System.out.println("El promedio final es: "+promedioFinal);
    }
    else {
      System.out.println("Ingrese bien las notas");
    }
  }

  public static void main(String[] args) {
    promedioAlumnoMRPC();
  }
}