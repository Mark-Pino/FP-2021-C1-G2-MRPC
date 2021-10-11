import java.util.Scanner;
public class Probar_Ejercicios {
  static Scanner sc = new Scanner(System.in);
  //3.1
  static void votoElecciones(){
    //Definir Variables
    int edad=0;
    String voto="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.1 ******");
    System.out.println("Ingrese la edad:");
    edad=sc.nextInt();
    //Proceso
    if (edad>=18){
      voto="Puede votar";
    }
    else if (edad>=0 && edad<18){
      voto="No puede votar";
    }
    else {
      voto="No tiene edad";
    }
    //Datos  de salida
    System.out.println("Ud. "+voto);
  }
  //3.2
  static void sueldoSemanal(){
    //Definir Variables
    int horaTrabajo=0, pagoHora=0;
    double sueldoSemanal=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.2 ******");
    System.out.println("Ingrese las horas de trabajo en la semana:");
    horaTrabajo=sc.nextInt();
    System.out.println("Ingrese el pago por hora:");
    pagoHora=sc.nextInt();
    //Proceso
    if (horaTrabajo>40 && pagoHora>0){
      sueldoSemanal=(pagoHora*horaTrabajo)*2;
    }
    else if (horaTrabajo>0 && horaTrabajo<=40 && pagoHora>0) {
      sueldoSemanal=pagoHora*horaTrabajo;
    }
    //Datos de salida
    if (horaTrabajo<=0 && pagoHora<=0) {
      System.out.println("No cuenta con pago ni con horas!");
    }
    else if (horaTrabajo<=0) {
      System.out.println("No tiene horas de trabajo!");
    }
    else if (pagoHora<=0) {
      System.out.println("No tiene pago por hora!");
    }
    else {
      System.out.println("El sueldo semanal es: "+sueldoSemanal);
    }
  }
  //3.3
  static void algoritmoRegalos(){
    //Defe¡inir Variables
    double monto=0;
    String regalo="";
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.3 ******");
    System.out.println("Ingrese el monto que dispone:");
    monto=sc.nextDouble();
    //Proceso
    if (monto>=1 && monto<=10.00) {
      regalo="\n-Targeta";
    }
    else if (monto>=11.00 && monto<=100.00) {
      regalo="\n-Chocolates\n-Targeta";
    }
    else if (monto>=101.00 && monto<=250.00) {
      regalo="\n-Flores\n-Chocolates\n-Targeta";
    }
    else if (monto>250){
      regalo="\n-Anillo\n-Flores\n-Chocolates\n-Targeta";
    }
    else {
      regalo="\nNinguno";
    }
    //Datos de Salida
    System.out.println("Ud. puede elegir los siguientes: "+regalo);
  }
  //3.4
  static void cobrarEstacionamiento(){
    //Definir Variables
    int horas=0;
    double pagoHoras=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.4 ******");
    System.out.println("Ingrese la cantidad de horas:");
    horas=sc.nextInt();
    //Proceso
    if (horas>0 && horas<=2){
      pagoHoras=5.00;
    }
    else if (horas>2 && horas<=5){
      pagoHoras=4.00;
    }
    else if (horas>5 && horas<=10){
      pagoHoras=3.00;
    }
    else if (horas>10){
      pagoHoras=2.00;
    }
    //Datos  de salida
    if (horas<0){
      System.out.println("No cuenta con horas!");
    }
    else {
      System.out.println("El precio es: $"+pagoHoras+" c/u.");
    }
  }
  //3.5
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
  //3.6
  static void descuentoCosto(){
    //Definir Variables
    int costo=0;
    double descuento=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.6 ******");
    System.out.println("Ingrese el costo:");
    costo=sc.nextInt();
    //Proceso
    if (costo>0 && costo<100) {
      descuento=costo-(costo*0.10);
    }
    else if (costo>=100 && costo<200){
      descuento=costo-(costo*0.12);
    }
    else if (costo>=200) {
      descuento=costo-(costo*0.15);
    }
    //Datos  de salida
    if (costo<0) {
      System.out.println("Ingrese bien los datos");
    }
    else {
    System.out.println("El descuento es: "+descuento);
    }
  }
  //3.7
  static void becaPresEst(){
    //Declaracion de variables e inicializacion
    int edad=0;
    double promedio=0, montoBeca=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.7 ******");
    System.out.println("Ingrese su edad:");
    edad=sc.nextInt();
    System.out.println("Ingrese su promedio de nota:");
    promedio=sc.nextDouble();    
    //Proceso
    if(edad>18){
      if(promedio>=9){
        montoBeca=2000;
      }else if(promedio>=7.5 && promedio<9){
        montoBeca=1000;
      }else if(promedio>=6 && promedio<7.5){
        montoBeca=500;
      }else{
        montoBeca=0;
      }
    }else{
      if(promedio>=9){
        montoBeca=3000;
      }else if(promedio>=8 && promedio<9){
        montoBeca=2000;
      }else if(promedio<8 && promedio>=6){
        montoBeca=100;
      }else{
        montoBeca=0;
      }
    }
    //Datos Salida
    if(montoBeca==0){
      System.out.println("Esforzarse para el proximo ciclo...!");
    }else{
      System.out.println("Felicitaciones Ud. es acreedor de una Beca por el Monto de: $"+montoBeca);
    }

  }
  //3.8
  static void bonoTrabajador(){
    //Definir variables
    int anhoAnt;
    double sueldo, bonoAnt=0, bonoSueld=0, bonoReal=0;
    //Datos de Entrada
    System.out.print("***** Ejercicio 3.8 ******");
    System.out.print("Ingrese años de antiguedad:");
    anhoAnt=sc.nextInt();
    System.out.print("Ingrese el sueldo del trabajador:");
    sueldo=sc.nextDouble();
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
  //3.9
  static void pagoPolizas(){
    //Defe¡inir Variables
    String plan, alcohol, lentes, enfermedad;
    int edad;
    double costoPago, recargos=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.9 ******");
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
  //3.10
  static void lugarViaje(){
    //Definir Variables
    int dinero=0, cobroKilometro=0;
    double costo=0, mexico=750, pv=800, acapulco=1200, cancun=1800;
    String destino="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.10 *****");
    System.out.println("Ingrese su presupuesto:");
    dinero=sc.nextInt();
    System.out.println("Ingrese el cobro por kilometro:");
    cobroKilometro=sc.nextInt();
    //Proceso
    if (dinero>=0 && cobroKilometro>=0){ //Definir y calcular el precio del viaje y los lugares
      costo=dinero*cobroKilometro;
      mexico=mexico*cobroKilometro*2;
      pv=pv*cobroKilometro*2;
      acapulco=acapulco*cobroKilometro*2;
      cancun=cancun*cobroKilometro*2;
    }
    if (costo>=mexico && costo<pv) {//Calculando el destino del viaje
      destino="\n-Mexico";
    }
    else if (costo>=pv && costo<acapulco) {
      destino="\n-Mexico\n-P.V.";
    }
    else if (costo>=acapulco && costo<cancun) {
      destino="\n-Mexico\n-P.V.\n-Acapulco";
    }
    else if (costo>=cancun) {
      destino="\n-Mexico\n-P.V.\n-Acapulco\n-Cancún";
    }
    //Datos  de salida
    if (dinero<0) {
      System.out.println("Ingrese bien el presupuesto");
    }
    else if(cobroKilometro<0) {
      System.out.println("Ingrese bien el cobro por kilometro");
    }
    else if (costo<mexico) {
      System.out.println("No puede viajar, quedese en casa");
    }
    else {
      System.out.println("Podria ir a: "+destino);
    }
  }
  //3.11
  static void bonoAntiguedad(){
    //Definir Variables
    int antiguedad=0, bono=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.11 *****");
    System.out.println("Ingrese la antiguedad de trabajando en la tienda:");
    antiguedad=sc.nextInt();
    //Proceso
    if (antiguedad==1){
      bono=100;
    }
    else if (antiguedad==2){
      bono=200;
    }
    else if (antiguedad==3){
      bono=300;
    }
    else if (antiguedad==4){
      bono=400;
    }
    else if (antiguedad==5){
      bono=500;
    }
    else if (antiguedad>5){
      bono=1000;
    }
    //Datos  de salida
    if (antiguedad==0) {
      System.out.println("No cuenta con la suficiente antiguedad de trabajo");
    }
    else if (antiguedad<0) {
      System.out.println("Ingrese bien la antiguedad");
    }
    else {
      System.out.println("Su bono es de: $"+bono);
    }
  }
  //3.12
  static void sueldoSemanalTrabajador(){
    //Definir Variables
    int horaTrabajo=0, pagoHora=0;
    double sueldoSemanal=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.12 *****");
    System.out.println("Ingrese las horas de trabajo en la semana:");
    horaTrabajo=sc.nextInt();
    System.out.println("Ingrese el pago por hora:");
    pagoHora=sc.nextInt();
    //Proceso
    if (horaTrabajo>0 && horaTrabajo<=40 && pagoHora>0){
      sueldoSemanal=(pagoHora*horaTrabajo);
    }
    else if (horaTrabajo>=41 && horaTrabajo<=45 && pagoHora>0) {
      sueldoSemanal=(pagoHora*horaTrabajo)*2;
    }
    else if (horaTrabajo>=46 && horaTrabajo<=50 && pagoHora>0) {
      sueldoSemanal=(pagoHora*horaTrabajo)*3;
    }
    //Datos de salida
    if (horaTrabajo==50 && pagoHora>0) {
      System.out.println("Ya no puede trabajar mas");
    }
    if (horaTrabajo>50 && pagoHora>0) {
      System.out.println("No puede trabajar mas de 50 horas solo se contara las 50 horas");
      sueldoSemanal=(pagoHora*50)*3;
      System.out.println("Su sueldo semanal es de: "+sueldoSemanal);
    }
    else if (horaTrabajo<=0 && pagoHora<=0) {
      System.out.println("No cuenta con pago ni con horas!");
    }
    else if (horaTrabajo<=0) {
      System.out.println("No tiene horas de trabajo!");
    }
    else if (pagoHora<=0) {
      System.out.println("No tiene pago por hora!");
    }
    else {
      System.out.println("Su sueldo semanal es de: "+sueldoSemanal);
    }
  }
  //3.13
  static void viajeEstudiantes(){
    //Definir Variables
    int alumnos=0;
    double pasaje=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.13 *****");
    System.out.println("Ingresar numero de estudiantes:");
    alumnos=sc.nextInt();
    //Proceso
    if (alumnos>0 && alumnos<20){
      pasaje=70*alumnos;
    }
    else if (alumnos>=20 && alumnos<50){
      pasaje=40;
    }
    else if (alumnos>=50 && alumnos<=100){
      pasaje=35;
    }
    else {
      pasaje=20;
    }
    //Datos  de salida
    if (alumnos<=0) {
      System.out.println("No hay alumnos");
    }
    else {
      System.out.println("El pasaje cuesta: $"+pasaje);
    }
  }
  //3.14
  static void calificacionLetra(){
    //Definir Variables
    int puntaje=0;
    String calificacion="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.14 *****");
    System.out.println("Ingrese la calificación (0/10):");
    puntaje=sc.nextInt();
    //Proceso
    switch(puntaje) {
      case 0: calificacion="F";break;
      case 1: calificacion="F";break;
      case 2: calificacion="F";break;
      case 3: calificacion="F";break;
      case 4: calificacion="F";break;
      case 5: calificacion="F";break;
      case 6: calificacion="D";break;
      case 7: calificacion="D";break;
      case 8: calificacion="C";break;
      case 9: calificacion="B";break;
      case 10: calificacion="A";break;
      default:
        calificacion="No existe";
    }
    //Datos  de salida
    System.out.println("La calificación es: "+calificacion);
  }
  //3.15
  static void mostrarDiaLetras(){
    //Definir variables
    int dia=0;
    String nombredia="";
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.15 *****");
    System.out.println("Ingrese un dia de la semana entre (1-7):");
    dia=sc.nextInt();
    //Proceso
    switch(dia) {
      case 1: nombredia="Domingo";break;
      case 2: nombredia="Lunes";break;
      case 3: nombredia="Martes";break;
      case 4: nombredia="Miercoles";break;
      case 5: nombredia="Jueves";break;
      case 6: nombredia="Viernes";break;
      case 7: nombredia="Sabado";break;
      default:
        nombredia="No existe";
    }
    //Datos de Salida
    System.out.println("El dia es: "+nombredia);
  }
  //3.16
  static void bonoDocente(){
    //Definir Variables y otros
    int salarioMinimo=0, puntuacionObtenida=0;
    double bonoObtenido=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 3.16 *****");
    System.out.println("Ingrese el salario minimo:");
    salarioMinimo=sc.nextInt();
    System.out.println("Ingrese la puntuacion obtenida:");
    puntuacionObtenida=sc.nextInt();
    //Proceso
    if (puntuacionObtenida<=100 && puntuacionObtenida>=0){
      bonoObtenido=salarioMinimo;
    }
    else if(puntuacionObtenida >=101 && puntuacionObtenida<=150){
      bonoObtenido=salarioMinimo*2;
    }
    else if(puntuacionObtenida>150){
      bonoObtenido=salarioMinimo*3;    
    }
    //Datos de salida
    System.out.println("El docente obtendra un bono de:"+bonoObtenido );  
  }
  //3.17
  static void paquetes(){
    //Definir Variables
    double monto=0;
    String regalo="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.17 *****");
    System.out.println("Ingrese el monto que recibe en diciembre:");
    monto=sc.nextDouble();
    //Proceso
    if (monto>=50000){
      regalo="A";
    }
    else if (monto<50000 && monto>=20000){
      regalo="B";
    }
    else if (monto<20000 && monto>=10000){
      regalo="C";
    }
    else if (monto<10000 && monto>0){
      regalo="D";
    }
    //Datos  de salida
    System.out.println("El paquete que puede comprar es: "+regalo);
  }
  //3.18
  static void bonoNavideño(){
    //Definir Variables
    int antiguedad=0, sueldo=0;
    double bono=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.18 *****");
    System.out.println("Ingrese los años de antiguedad:");
    antiguedad=sc.nextInt();
    System.out.println("Ingrese el sueldo:");
    sueldo=sc.nextInt();
    //Proceso
    if (antiguedad>=4){
      bono=sueldo*0.25;
    }
    else {
      bono=sueldo*0.20;
    }
    if (sueldo<2000){
      bono=sueldo*0.25;
    }
    else {
      bono=sueldo*0.20;
    }
    //Datos  de salida
    if (antiguedad<0) {
      System.out.println("Ingrese bien los años");
    }
    else if (sueldo<0) {
      System.out.println("Ingrese bien el sueldo");
    }
    else
    System.out.println("Su bono navideño es de: "+bono);
  }
  //3.19
  static void tipoVacuna(){
    //Definir Variables
    String sexo="", vacuna="";
    int edad=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.19 *****");
    System.out.println("Ingrese el sexo (H/F):");
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
    else if (edad>=0 && edad<=69 && sexo.equals("H")) {
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
  //3.20
  static void fabricaPantalones(){
    //Definir Variables
    int numeroPantalones=0, costoTelaA=0, costoTelaB=0, tipoPantalon=0;
    double recargo=0, precioFinal=0, precioPantalon=0, gananciasTienda=0, gananciasPantalones=0;
    String tipoTela="";
    //Datos de entrada
    System.out.println("***** Ejercicio 3.20 *****");
    System.out.println("Ingrese numero de pantalones:");
    numeroPantalones=sc.nextInt();
    System.out.println("Ingrese el tipo de pantalon (30/32/36):");
    tipoPantalon=sc.nextInt();
    System.out.println("Ingrese el modelo que desea hacer (A/B):");
    tipoTela=sc.next();
    if (tipoTela.equals("A")) {
      System.out.println("Ingrese el costo de la tela A 1.50m:");
      costoTelaA=sc.nextInt();
    }
    else {
      System.out.println("Ingrese el costo de la tela B 1.80m:");
      costoTelaB=sc.nextInt();
    }
    //Proceso 
    if (tipoTela.equals("A")) {
      recargo+=numeroPantalones/(costoTelaA*0.80);
    }
    else {
      recargo+=numeroPantalones/(costoTelaB*0.95);
    }
    if (tipoPantalon==32 || tipoPantalon==36) {
      recargo+=recargo+0.4;
    }
    if (tipoTela.equals("A")){
      precioFinal=numeroPantalones*(recargo+0.30);
    }
    else {
      precioFinal=numeroPantalones*(recargo+0.30);
    }
    gananciasTienda=precioFinal/recargo+0.30;
    gananciasPantalones=gananciasTienda/numeroPantalones;
    precioPantalon=precioFinal/numeroPantalones;
    //Datos  de salida
    System.out.println("El precio final es: $"+precioFinal+"\nEl precio por pantalon: $"+precioPantalon+"\nLa ganancia de la tienda es: $"+gananciasTienda+"\nLa ganacia por pantalon de la tienda: $"+gananciasPantalones);
  }
  //3.21
  static void sueldoBanco(){
    //Definir Variables
    int prueba=0;
    double prueba1=0;
    //Datos de entrada
    System.out.println("***** Ejercicio 3.21 *****");
    System.out.println(":");
    prueba=sc.nextInt();
    //Proceso
    if (prueba==1){
      prueba1=1+1;
    }
    //Datos  de salida
    System.out.println(": "+prueba1);
  }
  //Probar Ejercicios de la tarea
  static void probarEjercicios(){
    //Definir Variables
    int opcion=0;
    //Datos de entrada
    String msg="********** Probar ejercicios *********\nEliga el algoritmo que desea probar:\n1 = Ejercicio 3.1\n2 = Ejercicio 3.2\n3 = Ejercicio 3.3\n4 = Ejercicio 3.4\n5 = Ejercicio 3.5\n6 = Ejercicio 3.6\n7 = Ejercicio 3.7\n8 = Ejercicio 3.8\n9 = Ejercicio 3.9\n10 = Ejercicio 3.10\n11 = Ejercicio 3.11\n12 = Ejercicio 3.12\n13 = Ejercicio 3.13\n14 = Ejercicio 3.14\n15 = Ejercicio 3.15\n16 = Ejercicio 3.16\n17 = Ejercicio 3.17\n18 = Ejercicio 3.18\n19 = Ejercicio 3.19\n20 = Ejercicio 3.20\n21 = Ejercicio 3.21\n0 = Salir del menu de opciones";
    System.out.println(msg);
    opcion=sc.nextInt();
    //Proceso
    while(opcion!=0){
    switch(opcion){
        case 1: votoElecciones(); break;
        case 2: sueldoSemanal(); break;
        case 3: algoritmoRegalos(); break;
        case 4: cobrarEstacionamiento(); break;
        case 5: personaMenor(); break;
        case 6: descuentoCosto(); break;
        case 7: becaPresEst(); break;
        case 8: bonoTrabajador(); break;
        case 9: pagoPolizas(); break;
        case 10: lugarViaje(); break;
        case 11: bonoAntiguedad(); break;
        case 12: sueldoSemanalTrabajador(); break;
        case 13: viajeEstudiantes(); break;
        case 14: calificacionLetra(); break;
        case 15: mostrarDiaLetras(); break;
        case 16: bonoDocente(); break;
        case 17: paquetes(); break;
        case 18: bonoNavideño(); break;
        case 19: tipoVacuna(); break;
        case 20: fabricaPantalones(); break;
        case 21: sueldoBanco(); break;
        default: System.out.println("Opcion no existe!");
    }
    //Datos  de salida
    System.out.println(msg);
    opcion=sc.nextInt();
    }
  }

  public static void main(String[] args) {
    //votoElecciones();
    //sueldoSemanal();
    //algoritmoRegalos();
    //cobrarEstacionamiento();
    //personaMenor();
    //descuentoCosto();
    //becaPresEst();
    //bonoTrabajador();
    //pagoPolizas();
    //lugarViaje();
    //bonoAntiguedad();
    //sueldoSemanalTrabajador();
    //viajeEstudiantes();
    //calificacionLetra();
    //mostrarDiaLetras();
    //bonoDocente();
    //paquetes();
    //bonoNavideño();
    //tipoVacuna();
    //fabricaPantalones();
    //sueldoBanco();
    probarEjercicios();
  }
}