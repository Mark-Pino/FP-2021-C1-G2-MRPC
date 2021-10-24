import java.util.Scanner;
public class Ejercicio_4_1 {
  static Scanner sc = new Scanner(System.in);
  //1
  static void salario() {
    //Definir Variables
    int i;
    double salario_inicial, salario_recibido;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.1 ******");
    salario_inicial=1500;
    //Proceso y Datos de Salida
    
    for (i=1; i<=6; i++) {
      System.out.println("Año: "+i);
      salario_recibido=salario_inicial*Math.pow(1.1, i);
      System.out.println("Salario inicial: "+Math.round(salario_inicial));
      System.out.println("Salario recibido: "+Math.round(salario_recibido));
      System.out.println();
    }
  }
  //2
  static void hamburguesas() {
    //Definir Variables
    int cantidadHam; 
    double costoFinal=0; String pagoTarjeta;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.2 ******");
    //Proceso
    for(int tipoHam=1; tipoHam<=3; tipoHam++){
      if(tipoHam==1){
        System.out.println("Cantidad de Hamburguesas de Tipo Simple:"); 
        cantidadHam=sc.nextInt();
        costoFinal=costoFinal+cantidadHam*20;
      }
      else if(tipoHam==2){
        System.out.println("Cantidad de Hamburguesas de Tipo Doble:");
        cantidadHam=sc.nextInt();
        costoFinal=costoFinal+cantidadHam*25;
      }
      else{
        System.out.println("Cantidad de Hamburguesas de Tipo Triple:"); 
        cantidadHam=sc.nextInt();
        costoFinal=costoFinal+cantidadHam*28;                
      }
    }
    //Datos de Salida
    System.out.println("El costo de las Hamburguesas es: "+costoFinal);  
    System.out.println("¿Desea Pagar con Tarjeta(S/N)?");
    pagoTarjeta=sc.next();
    if(pagoTarjeta.equals("S")){
      costoFinal=costoFinal+costoFinal*0.05; 
    }
    System.out.println("El costo total de la Hamburguesa es:"+costoFinal);
  }
  //3
  static void nCantidad() {
    //Definir Variables
    int n, f, valor, cantidad1=0, cantidad2=0, cantidad3=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.3 ******");
    System.out.println("Ingrese la cantidad de valores:");
    n=sc.nextInt();
    //Proceso
    for(f=1;f<=n;f++) {
      System.out.println("Ingrese el valor "+f+":");
      valor=sc.nextInt();
      if(valor>0){
        cantidad1=cantidad1+1;
      }
      else if(valor==0){
        cantidad2=cantidad2+1;
      }
      else {
        cantidad3=cantidad3+1;
      }
    }
    //Datos de Salida
    System.out.println("La cantidad de numeros mayores a 0 son: "+cantidad1);
    System.out.println("La cantidad de numeros iguales a 0 son: "+cantidad2);
    System.out.println("La cantidad de numeros menores a 0 son: "+cantidad3);
  }
  //4
  static void focos() {
    //Definir Variables
    int color, focos_blancos=0, focos_rojos=0, focos_verdes=0, i, n;
    //Datos de Entrada
    System.out.println("Ingresa el numero de lotes de focos: ");
    n=sc.nextInt();
    //Proceso
    for (i=1; i<=n; i++) {
      System.out.println("Lote numero: "+i);
      System.out.println("Seleccione el color del lote:");
      System.out.println("1=verde\n2=blanco\n3=rojo");
      do {
          color=sc.nextInt();
          sc.nextLine();
          if (color<1||color>3)
           System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
      }
      while (color<1||color>3);
      if(color==1)
          focos_verdes=focos_verdes+1;
      if(color==2)
          focos_blancos=focos_blancos+1;
      if(color==3)
          focos_rojos=focos_rojos+1;
      System.out.println();
    }
    //Datos de Salida
    System.out.println("Lote de focos verdes: " + focos_verdes);
    System.out.println("Lote de focos blancos: " + focos_blancos);
    System.out.println("Lote de focos rojos: " + focos_rojos);
  }
  //5
  static void ahorroPesos() {
    //Definir Variables 
    double ahorroDias, ahorroInicial=3;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.5 ******");
    //Proceso y Datos de Salida
    for (int dia=1; dia<=365; dia++) {
      ahorroDias=Math.pow(ahorroInicial, dia);
      System.out.println("Lo ahorrado en el dia "+dia+" es "+ahorroDias+ " pesos");
    }
  }
  //6
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
  //7
  static void hamburguesasMenu() {
    //definir variables
    int opciones=1;
    String tarjeta;
    double montoT=0;
    //datos de entrada
    System.out.println("***** Ejercicio 4.7 ******");
    System.out.print("Escoja su hamburguesa");
    String hams="\n1=Hambuguesa sencilla\n2=Hamburguesa doble\n3=Hamburguesa triple\n0=Salir";
    System.out.println(hams);
    int opciones=sc.nextInt(); 
    //proceso
    do {
      switch (opciones) {
        case 1:montoT=montoT+(20); break;
        case 2:montoT=montoT+(25); break;
        case 3:montoT=montoT+(28); break;
        default:System.out.println("Opcion no existe"); break;
      }
      if (opciones!=0){
        System.out.println("¿Desea otra haburguesa? "+hams);
        opciones=sc.nextInt();
      }
    }
    while (opciones!=0);
    System.out.println("¿Desea pagar con tarjeta (S/N)?");
    tarjeta=sc.next();
    if (tarjeta.equals("S")) {
      montoT=montoT+(montoT*0.05);
    }
    //datos de salida
    System.out.println("El costo final es: "+montoT);
  }
  //8
  static void articulos() {
    //Definir variables
    System.out.println("Ingrese la cantidad de articulos los cuales se le descontara");
    String descuento=""; 
    //datos de entrada
    System.out.println("***** Ejercicio 4.8 ******");
    int precio=sc.nextInt();
    if(precio<=200){
    descuento="0.15";
    }else if (precio>100 && precio<200){
    descuento="0.12";}
    else if (precio<100){
    descuento="0.10";}
    //Datos de salida:
    System.out.println("El descuento que recivira es: "+descuento);
  }
  //9
  static void deposito() {
    //definir variables
    double cantidad=0;
    int cantaños=0, contador=1;
    //datos de entrada
    System.out.println("***** Ejercicio 4.9 ******");
    System.out.println("Ingrese cuantos años ingreso dinero:");
    cantaños=sc.nextInt();
    //Proceso y datos de salida
    while (contador<=cantaños) {
      System.out.println("Indique la cantidad de dinero que ingreso el año "+contador+":");
      cantidad=sc.nextInt();
      cantidad=(cantidad*0.1)+cantidad;
      contador++;
    }
    System.out.println("Para el año "+cantaños+" ahorro: "+cantidad);
  }
  //10
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
  //Probar ejercicios
  static void probarEjercicios(){
    //Definir Variables
    int opcion=0;
    //Datos de entrada
    String msg="********** Probar ejercicios *********\nEliga el algoritmo que desea probar:\n1 = Ejercicio 3.1\n2 = Ejercicio 3.2\n3 = Ejercicio 3.3\n4 = Ejercicio 3.4\n5 = Ejercicio 3.5\n6 = Ejercicio 3.6\n7 = Ejercicio 3.7\n8 = Ejercicio 3.8\n9 = Ejercicio 3.9\n10 = Ejercicio 3.10\n0 = Salir del menu de opciones";
    System.out.println(msg);
    opcion=sc.nextInt();
    //Proceso
    while(opcion!=0){
    switch(opcion){
      case 1: salario(); break;
      case 2: hamburguesas(); break;
      case 3: nCantidad(); break;
      case 4: focos(); break;
      case 5: ahorroPesos(); break;
      case 6: salarioMenu(); break;
      case 7: hamburguesasMenu(); break;
      case 8: articulos(); break;
      case 9: deposito(); break;
      case 9: promedioEdades(); break;
        default: System.out.println("Opcion no existe!");
    }
    //Datos  de salida
    System.out.println(msg);
    opcion=sc.nextInt();
    }
  }

  public static void main(String[] args) {
    probarEjercicios();
  }
}