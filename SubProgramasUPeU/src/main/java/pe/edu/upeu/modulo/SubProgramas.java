package pe.edu.upeu.modulo;
import java.util.Scanner;
public class SubProgramas {
//variables

  public String nombre="dario";
  private String dni="";
  static Scanner sc = new Scanner(System.in);

  public void saludo() {
    System.out.println("Hola "+nombre);
  }

  public void otroSaludo() {

    String apellidos="Perez";

    System.out.println("Hola "+nombre+apellidos);
  }
}