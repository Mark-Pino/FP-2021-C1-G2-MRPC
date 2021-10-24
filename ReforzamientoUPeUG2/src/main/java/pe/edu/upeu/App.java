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
    }

    public static void controlStructura() {
        
    }
    

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        operadores();
    }
}
