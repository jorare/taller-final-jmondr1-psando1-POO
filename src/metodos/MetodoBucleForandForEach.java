package metodos;

import explicaciones.ExplicacionesMenuBucleForyForEach;
import menus.SubMenuDatos;
import programas.EjercicioPracticoFor;

import java.util.Scanner;

public class MetodoBucleForandForEach {

    public static final Scanner scanner = new Scanner(System.in);
    public static void bucleForandForEach() {

        int opcion = 0;

        do {

            SubMenuDatos.menuBucleForyForEach();

            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    ExplicacionesMenuBucleForyForEach.explicacionbucleforyforeach();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuBucleForyForEach.estructuradelbucleforenjava();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:

                    ExplicacionesMenuBucleForyForEach.examinarunbucleenjava();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 4:

                    ExplicacionesMenuBucleForyForEach.ejemplobuclefor();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 5:

                    ExplicacionesMenuBucleForyForEach.ejemplosdebuclesforvalidos();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 6:

                    ExplicacionesMenuBucleForyForEach.ejemplodebuclesforeach();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 7:

                    EjercicioPracticoFor.ejercicioFOR();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 8:
                    System.out.println("ha oprimido la opcion 7 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (opcion != 8);

    }



}
