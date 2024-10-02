package metodos;

import explicaciones.ExplicacionesMenuBucleWhile;
import menus.SubMenuDatos;
import programas.EjercicioPracticoWhile;

import java.util.Scanner;

public class MetodoBucleWhile {

    public static final Scanner scanner = new Scanner(System.in);
    public static void bucleWhile() {

        int opcion = 0;

        do {

            SubMenuDatos.menuBucleWhile();

            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    ExplicacionesMenuBucleWhile.explicacionbuclewhile();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuBucleWhile.ejemplobuclewhile();


                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    EjercicioPracticoWhile.ejerciciowhile();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter


                case 4:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (opcion != 4);

    }



}
