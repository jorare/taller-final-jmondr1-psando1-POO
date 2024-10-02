package ejecucion;

import explicaciones.*;
import menus.MenuPrincipal;
import menus.SubMenuDatos;
import metodos.*;

import java.util.Scanner;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {

            MenuPrincipal.menuPrincipal();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    MetodoDatosPrimitivos.DatosPrimitivos();
                    break;

                case 2:
                    MetodoDatosString.DatosString();
                    break;

                case 3:
                    MetodoConstantesJava.constantesJava();
                    break;

                case 4:
                    MetodoTipoOperadoresJava.tiposOperadoresJava();
                    break;

                case 5:
                    MetodoCondicionalesIfElse.condicionalesIFELSE();
                    break;

                case 6:
                    MetodoCondicionalSwitch.condicionalSwitch();
                    break;

                case 7:
                    MetodoCondicionalTernaria.condicionalTernaria();
                    break;

                case 8:
                    MetodoBucleDoWhile.bucleDoWhile();
                    break;

                case 9:
                    MetodoBucleWhile.bucleWhile();

                    break;

                case 10:
                    MetodoBucleForandForEach.bucleForandForEach();
                    break;

                case 11:
                    System.out.println("ha oprimido la opcion 11 Salir...");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opcion != 11);
    }

}









