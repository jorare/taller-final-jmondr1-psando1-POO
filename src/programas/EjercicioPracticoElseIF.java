package programas;
import java.util.Scanner;


public class EjercicioPracticoElseIF {


    public static void ejercicioElseIF() {

        System.out.println("Desarrolle un algoritmo que permita leer tres valores y almacenarlos en las variables A, B y C respectivamente.\n El algoritmo debe imprimir cual es el mayor y cual es el menor." +
                "Recuerde constatar que los tres valores introducidos por el teclado sean valores distintos. \n Presente un mensaje de alerta en caso de que se detecte la introducción de valores iguales.");


        int a, b, c;
        System.out.println("Ingrese un numero (A)");
        Scanner scannerNumeroA = new Scanner(System.in);
        a = scannerNumeroA.nextInt();

        System.out.println("Ingrese un numero (B)");
        Scanner scannerNumeroB = new Scanner(System.in);
        b = scannerNumeroB.nextInt();

        System.out.println("Ingrese un numero (C)");
        Scanner scannerNumeroC = new Scanner(System.in);
        c = scannerNumeroC.nextInt();

        if (a == b || a == c || b == c) {
            System.out.println(" Hay numeros repetidos, vuelva a intentar");
        } else {
            if (a > b & a > c) {
                System.out.println(a + " es el numero mayor");
            } else if (b > a & b > c) {
                System.out.println(b + " es el numero mayor");
            } else if (c > a & c > b) {
                System.out.println(c + " es el numero mayor");
            }
        }

        if (a < b & a < c) {
            System.out.println(a + " es el numero menor");
        } else if (b < a & b < c) {
            System.out.println(b + " es el numero menor");
        } else if (c < a & c < b) {
            System.out.println(c + " es el numero menor");
        }

    }

}
