import java.util.Scanner;
public class Ejercicio_4_10 {
  static Scanner sc=new Scanner(System.in);
  
  static void promedioEdades() {
    //definir variables
    int cantalum=1,edadt=0,ndesalon=0,edad;
    double promedad=0,promediototal=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 4.10 *****");
    System.out.println("Ingrese el numero de salones");
    ndesalon=sc.nextInt();
    //Proceso
    for (int contador=1; contador<=ndesalon; contador++) {
      System.out.println("Ingrese la cantidad de alumnos");
      cantalum=sc.nextInt();
      for (int i=1; i<=cantalum; i++) {
        System.out.println("Ingrese la edad del alumno "+i+":");
        edad=sc.nextInt();
        edadt=edad+edadt;
        promedad=edadt/cantalum;
      }
    edadt=0;
    //Datos de salida
    System.out.println("El promedio de edad del salon "+contador+" es: "+Math.round(promedad));
    promediototal=promedad+promediototal;
    }
    promediototal=promediototal/ndesalon;
    System.out.println("El promedio de edad en los salones es: "+Math.round(promediototal));
  }

  public static void main(String[] args) {
    promedioEdades();   
  }
}