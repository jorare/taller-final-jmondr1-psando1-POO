package metodos;

import explicaciones.ExplicacionesMenuCondicionalesIfElse;
import menus.SubMenuDatos;
import programas.EjercicioPracticoElseIF;

import java.util.Scanner;

public class MetodoCondicionalesIfElse {

    public static final Scanner scanner = new Scanner(System.in);

    public static void condicionalesIFELSE() {

        int opcion = 0;

        do {


            SubMenuDatos.menuCondicionalifelseifelse();

            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    ExplicacionesMenuCondicionalesIfElse.explicacionIfElse();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuCondicionalesIfElse.ejemplodecondicionalif();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:

                    ExplicacionesMenuCondicionalesIfElse.ejemplodecondicionalelseif();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:

                    ExplicacionesMenuCondicionalesIfElse.ejemplodecondicionalelse();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 5:

                    EjercicioPracticoElseIF.ejercicioElseIF();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 6:
                    System.out.println("ha oprimido la opcion 6 volver al menu anterior..");

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (opcion != 6);

    }


}
