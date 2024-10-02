package programas;

public class EjercicioPracticoWhile {

    public static void ejerciciowhile() {

        System.out.println("********* Sumatoria con WHILE **********");
        System.out.println("Desarrolle un algoritmo que realice la sumatoria de los números enteros comprendidos entre el 1 y el 10 es decir, 1 + 2 + 3 + …. + 10");
        System.out.println("---------------------------------------");

        System.out.println("Ingrese numeros del 1 al 10");

// Inicializar Variables

        int i = 1, V1 = 1, V2 = 2, contador = 0;

// inicio de WHILE

        while (i < 10) {

            // Contador

            contador = V1 + V2;

            // Impresion de Variables + Contador
            System.out.println(V1 + " + " + V2 + " = " + contador);

            V1 = contador;

            V2++;

            i++;

        }

        //Impresion de los 10 primeros numeros

        System.out.println("La suma de los 10 primeros numeros es: " + contador);

    }
}