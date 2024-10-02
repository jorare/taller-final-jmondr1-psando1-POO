package metodos;

import explicaciones.ExplicacionesMenuCondicionalSwicth;
import menus.SubMenuDatos;
import programas.EjercicioPracticoSwitch;

import java.util.Scanner;

public class MetodoCondicionalSwitch {

    public static final Scanner scanner = new Scanner(System.in);
    public static void condicionalSwitch() {

        int opcion = 0;

        do {

            SubMenuDatos.menuCondicionalSwitch();

            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    ExplicacionesMenuCondicionalSwicth.explicacionswith();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuCondicionalSwicth.ejemplodecondicionalswitch();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:

                    System.out.println("                                                                         ");
                    System.out.println("                      Ejercicio Práctico switch                          ");
                    System.out.println(" ------------------------------------------------------------------------");
                    System.out.println("                                                                         ");
                    System.out.println("Desarrolla un programa que de acuerdo a la calificación númerica         ");
                    System.out.println("ingresada, indique en qué categoría se encuentra la nota.                ");
                    System.out.println("El número que se debe ingresar debe ser en el rango de 1 a 10            ");
                    System.out.println("                                                                         ");
                    System.out.println("Tenga en cuanta los siguientes datos de acuerdo al número ingresado:     ");
                    System.out.println("                                                                         ");
                    System.out.println("Si es 1 o 2 imprime Su calificación es: F                                ");
                    System.out.println("Si es 3 o 4 imprime Su calificación es: D                                ");
                    System.out.println("Si es 5 o 6 imprime Su calificación es: C                                ");
                    System.out.println("Si es 7 o 8 imprime Su calificación es: B                                ");
                    System.out.println("Si es 9 o 10 imprime Su calificación es: A                               ");
                    System.out.println("Si es diferente al rango imprime Número no válido, por favor verifique   ");

                    System.out.println("                                                                         ");
                    System.out.println("                                                                         ");

                    EjercicioPracticoSwitch.ejerciciopracticoswitch();

                    System.out.println("                                                                         ");
                    System.out.println(" ------------------------------------------------------------------------");
                    System.out.println("                                                                         ");


                    break;

                case 4:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");

                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (opcion != 4);

    }




}
