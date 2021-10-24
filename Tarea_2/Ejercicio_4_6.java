import java.util.Scanner;
public class Ejercicio_4_6 {
  static Scanner sc = new Scanner(System.in);

  static void salarioMenu() {
    //Definir Variables
    int i;
    double salario_inicial, salario_recibido;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.6 ******");
    double salarioFin=1500.00;
    //Proceso y Datos de Salida
    
    for (int años=1;años<=6; años++) {
        salarioFin=(salarioFin*0.1)+salarioFin;
        System.out.println("Su salario anual "+años+ " es: "+Math.round(salarioFin));
    }
  }

  public static void main(String[] args) {
    salarioMenu();
  }
}