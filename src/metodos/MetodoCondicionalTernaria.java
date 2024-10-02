package metodos;

import explicaciones.ExplicacionesMenuCondicionalesTernarias;
import menus.SubMenuDatos;
import programas.EjercicioPracticoTernarias;

import java.util.Scanner;

public class MetodoCondicionalTernaria {

    public static final Scanner scanner = new Scanner(System.in);
    public static void condicionalTernaria() {

        int opcion = 0;

        do {

            SubMenuDatos.menuCondicionalesTernarias();

            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    ExplicacionesMenuCondicionalesTernarias.condicionalesternarias();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuCondicionalesTernarias.ejemplocondicionalesternarias();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    EjercicioPracticoTernarias.ejercicioternarias();
                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

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
