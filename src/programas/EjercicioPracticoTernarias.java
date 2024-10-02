package programas;
import java.util.Scanner;
public class EjercicioPracticoTernarias {


    public static void ejercicioternarias(){

    Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
    int numero = scanner.nextInt();
    String resultado = (numero % 2 == 0) ? "El número es par." : "El número es impar.";
        System.out.println(resultado);

    }
}