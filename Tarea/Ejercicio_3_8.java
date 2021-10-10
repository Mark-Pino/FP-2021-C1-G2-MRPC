import java.util.Scanner;
public class Ejercicio_3_8 {
  static Scanner sc = new Scanner(System.in);

  static void bonoTrabajadorDMP(){
    //Definir variables
    int anhoAnt;
    double sueldo, bonoAnt=0, bonoSueld=0, bonoReal=0;
    //Datos de Entrada
    System.out.print("***** Ejercicio 3.8 ******");
    System.out.print("Ingrese anhos de antiguedad:");
    anhoAnt=teclado.nextInt();
    System.out.print("Ingrese el sueldo del trabajador:");
    sueldo=teclado.nextDouble();
    //Proceso
    if(anhoAnt>2 && anhoAnt<5){
      bonoAnt=sueldo*0.20;
    }else if (anhoAnt>=5){
      bonoAnt=sueldo*0.30;
    }
    if(sueldo<1000){
      bonoSueld=sueldo*0.25;
    }else if(sueldo>=1000 && sueldo<=3500){
    bonoSueld=sueldo*0.15;
    }else{
    bonoSueld=sueldo*0.10;
    }
    if(bonoAnt>=bonoSueld){
      bonoReal=bonoAnt;
    }else{
      bonoReal=bonoSueld;
    }
    //Datos de salida
    System.out.println("El trabajador tendra un bono de:"+bonoReal+ "\nSin embargo su bono por antiguedad es:  "+bonoAnt+" y el bono por sueldo es:"+bonoSueld);
  }
  public static void main(String[] args) {
    bonoTrabajador();
  }
}