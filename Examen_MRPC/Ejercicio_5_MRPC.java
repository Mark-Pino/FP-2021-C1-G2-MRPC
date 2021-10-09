import java.util.Scanner;
public class Ejercicio_5_MRPC{
  static Scanner sc = new Scanner(System.in);
  
  //Ejercicio 1
  static void promedioAlumnoMRPC(){
    //Definir Variables
    int nota1=0, nota2=0, nota3=0;
    double promedioFinal=0;
    //Datos de entrada
    System.out.println("***** Calcular el promedio final *****");
    System.out.println("Ingrese la nota del primer examen:");
    nota1=sc.nextInt();
    System.out.println("Ingrese la nota del segundo examen:");
    nota2=sc.nextInt();
    System.out.println("Ingrese la nota del tercer examen:");
    nota3=sc.nextInt();
    //Proceso y datos de salida
    if (nota1>=0 && nota1<=20 && nota2>=0 && nota2<=20 && nota3>=0 && nota3<=20){
      promedioFinal=(nota1*0.25)+(nota2*0.25)+(nota3*0.50);
      System.out.println("El promedio final es: "+Math.round (promedioFinal));
    }
    else {
      System.out.println("Ingrese bien las notas!");
    }
  }
  //Ejercicio 2
  static void bonoDesempeñoMRPC(){
    //Definir Variables
    int salario=0, puntos=0;
    double bono=0;
    //Datos de entrada
    System.out.println("********* Bono de profesores *********");
    System.out.println("Ingrese el salario minimo:");
    salario=sc.nextInt();
    System.out.println("Ingrese los puntos:");
    puntos=sc.nextInt();
    //Proceso y datos  de salida
    if (puntos>=100 && puntos<=200 && salario>0) {
      bono=salario*0.10;
      System.out.println("Su bono es de: "+bono);
    }
    else if (puntos>200 && puntos<=300 && salario>0) {
      bono=salario*0.40;
      System.out.println("Su bono es de: "+bono);
    }
    else if (puntos>300 && puntos<=400 && salario>0){
      bono=salario*0.70;
      System.out.println("Su bono es de: "+bono);
    }
    else if (puntos>400 && salario>0) {
      bono=salario*0.80;
      System.out.println("Su bono es de: "+bono);
    }
    else if (puntos<100 && salario<0) {
      System.out.println("No tiene el salario ni los puntos necesarios para el bono");
    }
    else if (puntos<100){
      System.out.println("No tiene puntos necesarios para el bono");
    }
    else {
      System.out.println("No tiene el salario necesario para el bono ");
    }
  }
  //Ejercicio 3
  static void tipoVacunaMRPC(){
    //Definir Variables
    String sexo="", vacuna="";
    int edad=0;
    //Datos de entrada
    System.out.println("********** Tipos de vacunas **********");
    System.out.println("Ingrese el sexo (M/F):");
    sexo=sc.next();
    System.out.println("Ingrese la edad:");
    edad=sc.nextInt();
    //Proceso
    if (edad>=70) {
      vacuna="C";
    }
    else if (edad>=16 && edad<=69 && sexo.equals("F")) {
      vacuna="B";
    }
    else if (edad>=0 && edad<=69 && sexo.equals("M")) {
      vacuna="A";
    }
    else if (edad>=0 && edad<16 && sexo.equals("F")) {
      vacuna="A";
    }
    else {
      vacuna="Ninguna";
    }
    //Datos  de salida
    System.out.println("El tipo de vacuna que la persona debe recibir es: "+vacuna);
  }
  //Ejercicio 4
  static void calcOperAritMRPC(){
    //Definir Variables
    double valor1=0, valor2=0, calcValores=0;
    String signo="";
    //Datos de entrada
    System.out.println("****** Operacion de 2 valores ********");
    System.out.println("Ingrese el primer valor:");
    valor1=sc.nextDouble();
    System.out.println("Ingrese el segundo valor:");
    valor2=sc.nextDouble();
    System.out.println("Ingrese cualquiera de estos signos:\n+ = Suma\n- = Resta\n/ = División\n* = Multiplicación\n^ = Potencia");
    signo=sc.next();
    //Proceso
    if (signo.equals("+")) {
      calcValores=valor1+valor2;
    }
    else if (signo.equals("-")) {
      calcValores=valor1-valor2;
    }
    else if (signo.equals("/")) {
      calcValores=valor1/valor2;
    }
    else if (signo.equals("*")) {
      calcValores=valor1*valor2;
    }
    else if (signo.equals("^")) {
      calcValores=Math.pow(valor1, valor2);
    }
    else {
      System.out.println("Ingrese bien el signo");
    }
    //Datos  de salida
    System.out.println("El resultado es: "+calcValores);
  }
  //Ejercicio 5
  static void probarEjerciciosMRPC(){
    //Definir Variables
    int opcion=0;
    //Datos de entrada
    String msg="********** Probar ejercicios *********\nEliga el algoritmo que desea probar:\n1 = Ejercicio 1\n2 = Ejercicio 2\n3 = Ejercicio 3\n4 = Ejercicio 4\n0 = Salir del menu de opciones";
    System.out.println(msg);
    opcion=sc.nextInt();
    //Proceso
    while(opcion!=0){
    switch(opcion){
        case 1: promedioAlumnoMRPC(); break;
        case 2: bonoDesempeñoMRPC(); break;
        case 3: tipoVacunaMRPC(); break;
        case 4: calcOperAritMRPC(); break;
        default: System.out.println("Opcion no existe!");
    }
    //Datos  de salida
    System.out.println(msg);
    opcion=sc.nextInt();
    }
  }

  public static void main(String[] args) {
    //promedioAlumnoMRPC();
    //bonoDesempeñoMRPC();
    //tipoVacunaMRPC();
    //calcOperAritMRPC();
    probarEjerciciosMRPC();
  }
}