package metodos;

import explicaciones.ExplicacionesMenuTiposOperadoresJava;
import menus.SubMenuDatos;

import java.util.Scanner;

public class MetodoTipoOperadoresJava {

    public static final Scanner scanner = new Scanner(System.in);
    public static void tiposOperadoresJava() {

        int opcion = 0;

        do {

            SubMenuDatos.menuTipoOperadoresJava();

            System.out.print("Ingrese la opcion: ");


            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {

                case 1:

                    ExplicacionesMenuTiposOperadoresJava.explicacionoperadoresAritmeticos();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuTiposOperadoresJava.explicacionoperadoresrelacionales();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:

                    ExplicacionesMenuTiposOperadoresJava.explicacionoperadoreslogicos();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:

                    ExplicacionesMenuTiposOperadoresJava.explicacionoperadoresasignacion();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 5:

                    ExplicacionesMenuTiposOperadoresJava.explicacionoperadoresincrementodecremento();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 6:
                    System.out.println("ha oprimido la opcion 6 volver al menú...");

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (opcion != 6);

    }


}
