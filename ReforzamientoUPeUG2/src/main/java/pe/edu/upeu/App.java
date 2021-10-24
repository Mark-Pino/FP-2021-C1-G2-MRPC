package pe.edu.upeu;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {

    public static void tiposDatos() {
        //Variables
        byte a=1;
        short b=8;
        int c=87;
        float d=84.4f;
        double f=87.21;
        boolean e=true;
        char h='+';
        String g="hola";
        Integer xx;
        Double xxx;
        Date ss;

    }

    public static void operadores() {
        int a=7, b=2;
        //Operadores
        System.out.println("suma: "+(a+b));
        System.out.println("resta: "+(a-b));
        System.out.println("division: "+(a/b));
        System.out.println("multiplicacion: "+(a*b));
        System.out.println("modulo: "+(a%b));
        System.out.println("Potencia:"+(Math.pow(a, b)));
        //Operadores logicos
        //int olog=(a/2)==0?1:2;
        int ologx=(a>b && a!=b)?1:0;
        System.out.println(ologx);
        int ologxx=(a>b || a==b)?1:0;
        System.out.println(ologxx);
        int ologxxx=!(a>b || a==b)?1:0;
        System.out.println(ologxxx);
        //Operadores relacionales
        System.out.println((a>b)?"verdadero":"falso");
        System.out.println((a>=b)?"verdadero":"falso");
        System.out.println((a<b)?"verdadero":"falso");
        System.out.println((a<=b)?"verdadero":"falso");
        System.out.println((a==b)?"verdadero":"falso");
        System.out.println((a!=b)?"verdadero":"falso");
        //Adicionales
        int x=4;
        System.out.println(--x);
        System.out.println(x++);
        System.out.println(x--);
        System.out.println(x+=2);
        System.out.println(x-=2);
        System.out.println(x*=2);
        System.out.println(x/=2);
        System.out.println(x%=2);
    }

    public static void controlStructura() {
        //Estructuras secuenciales
        //Calcular el area de un triangulo
        int b=4, h=2;
        System.out.println((b*h)/2);
        //Estructuras condicionales
        if (b>h) { //condicional simple
            System.out.println("B es Mayor");
        }

        if (b>h) { //condicional compuesta/bifurcada
            System.out.println("B es Mayor");
        }else{
            System.out.println("h es menor");
        }

        if (b>h) { //condicional compuesta anidada
            System.out.println("B es Mayor");
        }else if (b==h) {
            System.out.println("Ambos son iguales");
        }else{
            System.out.println("B es menor");
        }
        //Estructuras Condiciaonal Multiple
        int opcion=0;
        switch (opcion) {
            case 1: System.out.println("uno"); break;
            case 2: System.out.println("dos"); break;
            case 3: System.out.println("tres"); break;
            case 4: System.out.println("cuatro"); break;
            default: System.out.println("no existe"); break;
        }
        //Estructuras repititivas
        //while
        while (opcion==0) {
            System.out.println("Realizar operaciones");
            opcion++;
        }
        //for
        for (int i = -1; i < opcion; i++) {
            System.out.println("Realizar operaciones");
        }
        //do while
        do {
            System.out.println("Realizar operaciones");
            opcion++;
        } while (opcion==0);
    }
    

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        //operadores();
        //controlStructura();
        tablaMultiplicar();
    }

    public static void tablaMultiplicar() {
        for (int i = 1; i<=10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
}