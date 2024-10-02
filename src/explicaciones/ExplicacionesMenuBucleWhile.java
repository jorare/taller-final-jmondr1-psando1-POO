package explicaciones;

public class ExplicacionesMenuBucleWhile {


      public static void explicacionbuclewhile(){

                    System.out.println("********************************************************************");
                    System.out.println("**************    Explicación Bucle While      *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* Los bucles while en Java te permiten, como su nombre indica      *");
                    System.out.println("* (while significa mientras),repetir una acción en un bucle        *");
                    System.out.println("* siempre y cuando se cumpla una condición booleana de control.    *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Es posible que el código contenido en un bucle while no se       *");
                    System.out.println("* ejecute, porque no se cumpla la condición.                       *");
                    System.out.println("********************************************************************");
      }

      public static void ejemplobuclewhile(){

                    System.out.println("********************************************************************");
                    System.out.println("***************    Ejemplo Bucle While          ********************");
                    System.out.println("********************************************************************");
                    System.out.println("* while (condiciòn){                                               *");
                    System.out.println("* // Bloque de còdigo que se repetirá mientras la condición        *");
                    System.out.println("* sea verdadera.                                                   *");
                    System.out.println("*                                                                  *");
                    System.out.println("* int contador = 1;                                                *");
                    System.out.println("* while (contador <= 5){                                           *");
                    System.out.println("*    System.out.println('contador: ' + contador);                  *");
                    System.out.println("*      contador++;                                                 *");
                    System.out.println("*                                                                  *");
                    System.out.println("* import java.util.Scanner;                                        *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Scanner scanner = new Scanner(System.in);                        *");
                    System.out.println("* String respuesta = ' ';                                          *");
                    System.out.println("* while (!respuesta.equalsIgnoreCase('salir')){		               *");
                    System.out.println("*    System.out.print('Introduce un mensaje (escribe 'salir'       *");
                    System.out.println("*                     para terminar):                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*         respuesta = scanner.nextLine();                          *");
                    System.out.println("*         System.out.println('Has escrito: ' + respuesta);         *");
                    System.out.println("*         }                                                        *");
                    System.out.println("* System.out.println('!Fin del programa!')                         *");
                    System.out.println("* scanner.close();                                                 *");
                    System.out.println("********************************************************************");
      }

}
