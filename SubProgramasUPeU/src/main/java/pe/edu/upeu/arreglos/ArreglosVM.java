package pe.edu.upeu.arreglos;

import pe.edu.upeu.modelo.Persona;

public class ArreglosVM {

    public static void ejemploBasicoVectores() {
        int[] edades;//definir vector
        edades=new int[10];//definir tamanho del vector
        edades[0]=20;//Asignando valores en el vector
        edades[1]=18;
        edades[2]=16;
        edades[3]=19;

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edad "+(i+1)+"="+edades[i]);
        }
        
        Persona persona[];
        persona=new Persona[4];
        persona[0]=new Persona("Juan", "Carpio", "54875421");
        persona[1]=new Persona("Karla", "Carpio", "54875421");
        persona[2]=new Persona("Ramon", "Carpio", "54875471");
        persona[3]=new Persona("Pepito", "Carpio", "54875621");   
        
        Persona[] perX={
                        new Persona("Juan", "Carpio", "54875421"),
                        new Persona("Karla", "Carpio", "54875421"),
                        new Persona("Ramon", "Carpio", "54875471"),
                        new Persona("Pepito", "Carpio", "54875621"),
                        new Persona("Jaimito", "Carpio", "54875621")      
                        };
        //System.out.println("Primera persona:"+persona[0].nombre+ " dni:"+persona[0].dni);
        //System.out.println("Primera persona:"+persona[2].nombre+ " dni:"+persona[2].dni);
        for (Persona xx: persona) {
            System.out.println("Nombre:"+xx.nombre+ " dni:"+xx.dni+" apellido:"+xx.apellidos);
        }
        System.out.println();

        for (int i = 0; i < persona.length; i++) {
            System.out.println("Nombre:"+persona[i].nombre+ " dni:"+persona[i].dni+" apellido:"+persona[i].apellidos);
        }

        System.out.println("Other form:");
        for (Persona xx: perX) {
            System.out.println("Nombre:"+xx.nombre+ " dni:"+xx.dni+" apellido:"+xx.apellidos);
        }

    }

    private static void ejemploBasicoMatrices() {
        int[][] edades;
        edades=new int[3][2];
        edades[0][0]=30;
        edades[0][1]=15;

        edades[1][0]=20;
        edades[1][1]=45;

        edades[2][0]=5;
        edades[2][1]=38;

        for (int[] is : edades) {
            for (int is2 : is) {
                System.out.println(is2);
            }
        }

        System.out.println("Other form:");
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[0].length; j++) {
                System.out.println(edades[i][j]);
            }
        }
        System.out.println("Defenir matriz de forma directa:");
        String nombres[][]={
            {"Juan", "Pedro", "Pepito", "Jaimito", "paquito"}, 
            {"Ramon", "Raul"}
        };

        System.out.println(nombres.length);//tamanho fila
        System.out.println(nombres[0].length);//tamanho columna
        System.out.println(nombres[0][3]);
        System.out.println(nombres[1][1]);

        System.out.println("\nPrint other form:");
        for (String[] filaDato : nombres) {
            for (String columDato : filaDato) {
                System.out.println(columDato);
            }
        }

        
        System.out.println("\nPrint 2 form:");
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println(nombres[i][j]);
            }
        }
    }

    public static void transpuestaMatriz() {
        int[][] matriz={
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                };
        System.out.println("Transpuesta de una Matriz:");

        int[][] matrizT=new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[j][i]=matriz[i][j];
            }
        }
        // 
        System.out.println("print matriz original:");
        for (int[] filaDato : matriz) {
            for (int columDato : filaDato) {
                System.out.print(columDato+"\t");
            }
            System.err.println("");
        }        
        System.out.println("print matriz Transpuesta:");
        for (int[] filaDato : matrizT) {
            for (int columDato : filaDato) {
                System.out.print(columDato+"\t");
            }
            System.err.println("");
        }        
        
    }

    public static void main(String[] args) {
       /* String[] nombVect;
        nombVect=new String[5];
        nombVect[0]="Jhojan";
        System.out.println(nombVect[0]);*/
       // ejemploBasicoVectores();
       //ejemploBasicoMatrices();
       transpuestaMatriz();
    }
    
}
