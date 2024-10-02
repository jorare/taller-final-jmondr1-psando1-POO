package metodos;

import explicaciones.ExplicacionesMenuDatosString;
import menus.SubMenuDatos;

import java.util.Scanner;

public class MetodoDatosString {

    public static final Scanner scanner = new Scanner(System.in);
    public static void DatosString() {

        int opcion = 0;

        do {

            SubMenuDatos.menuDatosString();
            System.out.print("Ingrese la opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {

                case 1:

                    ExplicacionesMenuDatosString.datostring();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuDatosString.ejemplostring();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");

                    break;

                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (opcion != 3);

    }


}
