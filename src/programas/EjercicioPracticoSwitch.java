package programas;
import java.util.Scanner;

public class EjercicioPracticoSwitch {

    public static void ejerciciopracticoswitch(){

            System.out.println("Desarrolla un programa que de acuerdo a la calificación númerica ingresada, indique en qué categoría se encuentra la nota.\n El número que se debe ingresar debe ser en el rango de 1 a 10");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor Ingrese su Calificacion Obtenida");
            int calificacionObtenida = scanner.nextInt();
            if (calificacionObtenida < 1 || calificacionObtenida > 10) {
                System.out.println("Número no válido, por favor verifique");
            } else
                switch (calificacionObtenida) {
                    case 10:
                    case 9:
                        System.out.println("Su Calificacion es: A");
                        break;
                    case 8:
                    case 7:
                        System.out.println("Su Calificacion es: B");
                    case 6:
                    case 5:
                        System.out.println("Su Calificacion es: C");
                        break;
                    case 4:
                    case 3:
                        System.out.println("Su Calificacion es: D");
                        break;
                    case 2:
                    case 1:
                        System.out.println("Su Calificacion es: F");
                        break;
                }
        }
}







