package pe.edu.upeu.mrpc.examen_mrpc;
import pe.edu.upeu.mrpc.utils.LeerTeclado;

public class ResolucionExamenMRPC {
    static LeerTeclado sc=new LeerTeclado();

    //Ejercicio 2
    public void impuestoPagarAutomotriz() {
        //Variables
        double pagoImpuestosTotal=0, impuestoVehiculo=0, pagoImpuestoTotalCategoria=0;
        //Proceso y datos de entrada
        System.out.println("****************** Ejercicio 2 ******************");
        System.out.println("Determinar el impuesto de una automotriz");
        for (int categoria = 1; categoria <= 3; categoria++) {
            int cantidadVehiculos=sc.leer(0,"Ingrese la cantidad de Vehiculos de la categoria "+categoria+":");
            double costoVehiculos=sc.leer(0,"Ingrese el costo de Vehiculos de la categoria "+categoria+":"); 
            if (categoria==1) {
                impuestoVehiculo=costoVehiculos*0.12;
            }
            if (categoria==2) {
                impuestoVehiculo=costoVehiculos*0.08;
            }
            if (categoria==3) {
                impuestoVehiculo=costoVehiculos*0.05;
            }
            pagoImpuestoTotalCategoria=impuestoVehiculo*cantidadVehiculos;
            pagoImpuestosTotal+=pagoImpuestoTotalCategoria;
            //Datos de salida
            System.out.println("El impuesto a pagar por cada vehiculo de la categoria "+categoria+" es: "+impuestoVehiculo);
            System.out.println("El total impuesto de la cateroria "+categoria+" es: "+pagoImpuestoTotalCategoria);
            System.out.println();
        }
        System.out.println("El total de impuesto de todos los vehiculos es: "+pagoImpuestosTotal);
        System.out.println();
    }
    //Ejercicio 3
    public void multiplicarNumeroEntero() {
        //variables
        int n, multiplicador;
        //Datos de entrada 
        System.out.println("****************** Ejercicio 3 ******************");
        System.out.println("Tabla de multiplicar");
        n=sc.leer(0,"\nIngresar el numero entero positivo a multiplicar:");
        multiplicador=sc.leer(0,"Ingresar el limite de tu multiplicador:");  
        //Proceso
        if (n>0) {
            for (int i=1; i<=multiplicador; i++){
                System.out.println(n+"x"+i+" = "+n*i);
            }
        }
        else {
            System.out.println("El numero es incorrecto" );
        }
        System.out.println();
    }
    //Ejercicio 4
    public void determinarNumerosPerfectos() {
        //Variables
        int a, b, suma;
        a=1;
        //Datos de entrada
        System.out.println("****************** Ejercicio 4 ******************");
        System.out.println("Números perfectos entre 1 y 10000:");
        //Proceso
        while(a <= 10000){
            suma = 0;
            for(b = 1;b < a;b++){                       
                    if(a % b==0){
                    suma = suma + b;
                    }
            }
            if(a == suma){
        //Datos de salida             
                System.out.println(a);
            }
            a++;
        }
    }
    //Ejercicio 5
    public void Potenciación() {
        //Declarar Variables
        int base,exponente;
        //Datos de entrada
        System.out.println("****************** Ejercicio 5 ******************");
        System.out.println("Recusividad de potencia");
        base=sc.leer(0,"Ingrese la base:");
        exponente=sc.leer(0,"Ingrese el exponente:");
        //proceso
        System.out.println("El resultado es: "+base+" ^ "+exponente+" = "+recursividad(base,exponente));
        System.out.println();
    }
    public double recursividad(int base,int exponente) {
        if (exponente==0) {
            return 1;
        }
        else {
            return base*recursividad(base,exponente-1);
        }
    }
}