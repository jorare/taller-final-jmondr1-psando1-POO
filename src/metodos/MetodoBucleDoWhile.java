package metodos;

import explicaciones.ExplicacionesMenuBucleDoWhile;
import menus.SubMenuDatos;

import java.util.Scanner;

public class MetodoBucleDoWhile {

    public static final Scanner scanner = new Scanner(System.in);
    public static void bucleDoWhile() {

        int opcion = 0;

        do {

            SubMenuDatos.menuBucleDoWhile();

            System.out.print("Ingrese la opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:

                    ExplicacionesMenuBucleDoWhile.explicacionbucledowhile();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 2:

                    ExplicacionesMenuBucleDoWhile.ejemplobucledowhile();

                    System.out.println("                                                                 "); //Espacio en blanco
                    System.out.println("Presione Enter para continuar...");
                    scanner.nextLine(); // Espera a que el usuario presione Enter

                    break;

                case 3:
                    System.out.println("ha oprimido la opcion 3 volver al menu anterior..");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");

            }
        } while (opcion != 3);

    }




}
