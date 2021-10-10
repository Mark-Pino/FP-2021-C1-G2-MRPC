import java.util.Scanner;
public class Ejercicio_3_5 {
  static Scanner sc = new Scanner(System.in);

  static void personaMenor(){
    //declarar variables 
    String nomA, nomB, nomC, nomM="";
    int edadA, edadB, edadC, edadM=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.5 ******");
    System.out.println("Ingrese nombre 1ra Persona:");
    nomA=sc.next();
    System.out.println("Ingrese edad 1ra Persona:");
    edadA=sc.nextInt();  
    System.out.println("Ingrese nombre 2da Persona:");
    nomB=sc.next();
    System.out.println("Ingrese edad 2da Persona:");
    edadB=sc.nextInt();  
    System.out.println("Ingrese nombre 3ra Persona:");
    nomC=sc.next();
    System.out.println("Ingrese edad 3ra Persona:");
    edadC=sc.nextInt();      
    //Proceso
    if(edadA<edadB && edadA<edadC){
      edadM=edadA;
      nomM=nomA;
    }
    if(edadB<edadA && edadB<edadC){
      edadM=edadB;
      nomM=nomB;
    }
    if(edadC<edadA && edadC<edadB){
      edadM=edadC;
      nomM=nomC;
    }    
    //Datos de salida
    System.out.println("La persona menor es: "+ nomM +" y su edad es:"+edadM);
  }
  
  public static void main(String[] args) {
    personaMenor();
  }
}