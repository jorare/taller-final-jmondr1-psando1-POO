package metodos;

import explicaciones.ExplicacionesMenuConstantesJava;
import menus.SubMenuDatos;

import java.util.Scanner;

public class MetodoConstantesJava {

    public static final Scanner scanner = new Scanner(System.in);

    public static void constantesJava() {

        int opcion = 0;

        do {

            SubMenuDatos.menuConstantesJava();

            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {

                case 1:
                    ExplicacionesMenuConstantesJava.constantesjava();
                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:
                    ExplicacionesMenuConstantesJava.ejemplosconstantesjava();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 Salir...");

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (opcion != 3);

    }





}
