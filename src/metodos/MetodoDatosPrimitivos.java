package metodos;

import explicaciones.ExplicacionesMenuDatosPrimitivos;
import menus.SubMenuDatos;

import java.util.Scanner;

public class MetodoDatosPrimitivos {

    public static final Scanner scanner = new Scanner(System.in);
    public static void DatosPrimitivos() {

        int opcion = 0;

        do {

            SubMenuDatos.menuDatosPrimitivos();

            System.out.print("Ingrese la opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    ExplicacionesMenuDatosPrimitivos.explicacionbyte();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuDatosPrimitivos.explicacionshort();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:

                    ExplicacionesMenuDatosPrimitivos.explicacionint();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:

                    ExplicacionesMenuDatosPrimitivos.explicacionlong();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 5:

                    ExplicacionesMenuDatosPrimitivos.explicacionfloat();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 6:

                    ExplicacionesMenuDatosPrimitivos.explicaciondouble();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 7:

                    ExplicacionesMenuDatosPrimitivos.explicacionchar();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 8:

                    ExplicacionesMenuDatosPrimitivos.explicacionboolean();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 9:
                    System.out.println("ha oprimido la opcion 9 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");

            }
        } while (opcion != 9);

    }




}
