package explicaciones;

public class ExplicacionesMenuBucleForyForEach {

        public static void explicacionbucleforyforeach(){


                    System.out.println("********************************************************************");
                    System.out.println("*************  Explicación Bucle For y For-each ********************");
                    System.out.println("********************************************************************");
                    System.out.println("* El bucle for en Java, junto con su primo el for-each,            *");
                    System.out.println("* son estructuras lógicas que te permiten realizar una y otra vez  *");
                    System.out.println("* una acción, siempre y cuando se cumpla una condición booleana.   *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Los bucles for y for-each en Java son dos maneras de realizar    *");
                    System.out.println("* bucles. Aunque su nombre es similar, su estructura es diferente. *");
                    System.out.println("* Con el bucle for tienes más control en la ejecución del bucle.   *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");
        }

        public static void estructuradelbucleforenjava(){

                    System.out.println("********************************************************************");
                    System.out.println("************** Estructura del bucle for en Java  *******************");
                    System.out.println("********************************************************************");
                    System.out.println("* El bucle for en Java toma como punto de partida un índice de     *");
                    System.out.println("* control. Al final de cada bucle, este índice se actualiza según  *");
                    System.out.println("* una regla que estableces en la estructura del bucle.             *");
                    System.out.println("*                                                                  *");
                    System.out.println("* Acto seguido, el bucle comprueba si el índice satisface la       *");
                    System.out.println("* condición booleana.int contador = 1;                             *");
                    System.out.println("* El bucle for comienza con la palabra clave for y un paréntesis,  *");
                    System.out.println("*  que contiene tres partes.                                       *");
                    System.out.println("*                                                                  *");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*    public static void main(String args[]) {                      *");
                    System.out.println("*  // Estructura del bucle for                                     *");
                    System.out.println("*  for(int i = 0; // índice de control                             *");
                    System.out.println("*  i < 100;   // condición booleana           		       *");
                    System.out.println("*     i++)      // modificación del índice tras cada bucle         *");
                    System.out.println("*            {                                                     *");
                    System.out.println("*                                                                  *");
                    System.out.println("*         // Lo que quieras que se ejecute varias veces            *");
                    System.out.println("*             }                                                    *");
                    System.out.println("*         }                                                        *");
                    System.out.println("*    }                                                             *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

        }

        public static void examinarunbucleenjava(){


                    System.out.println("********************************************************************");
                    System.out.println("****************** Examinar un bucle en Java   *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* La flexibilidad a la hora de construir un bucle for en Java es   *");
                    System.out.println("* tan grande, que puedes prescindir de algunas de las partes de    *");
                    System.out.println("* las que te acabo de hablar. Por ejemplo, también puedes          *");
                    System.out.println("* establecer una evaluación  booleana que siempre sea true. Como   *");
                    System.out.println("* consecuencia, el bucle no deja nunca de ejecutarse hasta que el  *");
                    System.out.println("* programa se detiene con un error por falta de memoria.           *");
                    System.out.println("*                                                                  *");
                    System.out.println("*  Todo está permitido, con tres condiciones                       *");
                    System.out.println("*                                                                  *");
                    System.out.println("* * Los tres elementos van separados por ; (punto y coma) en        ");
                    System.out.println("*   cualquier caso.                                                *");
                    System.out.println("* * Si alguno de los elementos no está presente, los dos puntos    *");
                    System.out.println("*    y comas han de aparecer de todas formas.                      *");
                    System.out.println("* * El índice de control ha de existir (se ha de haber declarado,  *");
                    System.out.println("*   ya sea antes del bucle for o en la primera parte del           *");
                    System.out.println("*   paréntesis del bucle)                                          *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

        }

        public static void ejemplobuclefor(){


                    System.out.println("********************************************************************");
                    System.out.println("******************      Ejemplo bucle FOR      *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*    public static void main(String args[]) {                      *");
                    System.out.println("*                                                                  *");
                    System.out.println("*      for(int i = 0, f = 6; i < 10 && f > 0; i++, f--) {          *");
                    System.out.println("*       System.out.print(i + ' - ' + f + '  ');                    *");
                    System.out.println("*      }                                                           *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*   Resultado: 0 - 6  1 - 5  2 - 4  3 - 3  4 - 2  5 - 1            *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

        }

        public static void ejemplosdebuclesforvalidos(){

                    System.out.println("********************************************************************");
                    System.out.println("*********    Ejemplos de bucles for válidos    *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*      public static void main(String args[]) {                    *");
                    System.out.println("*      /*1*/                                                       *");
                    System.out.println("*       for(;;) {} // Bucle infinito.                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*      /*2*/                                                       *");
                    System.out.println("*      int i = 0                                                   *");
                    System.out.println("*      for(; i < 10; i++) {                                        *");
                    System.out.println("*  System.out.println(i);  // Bucle for válido, imprime de 0 a 9   *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*     /*3*/                                                        *");
                    System.out.println("*     int j = 0;                                                   *");
                    System.out.println("*     for(; ; j++) {                                               *");
                    System.out.println("*       System.out.println(j);  // Bucle infinito,                 *");
                    System.out.println("*      no existe ninguna evaluación                                *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*     /*4*/                                                        *");
                    System.out.println("*     int k = 0;                                                   *");
                    System.out.println("*      for(; k < 10;) {                                            *");
                    System.out.println("*       System.out.println(k);  // Bucle infinito, el índice       *");
                    System.out.println("*       no varía                                                   *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*     /*5*/                                                        *");
                    System.out.println("*     int l = 0;                                                   *");
                    System.out.println("*       for(; l > 10; l++) {                                       *");
                    System.out.println("*        System.out.println(l);  // No se ejecuta, la condición    *");
                    System.out.println("*        no se cumple inicialmente                                 *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("*    /*6*/                                                         *");
                    System.out.println("*    int m = 0;                                                    *");
                    System.out.println("*    for(; m < 10; m--) {                                          *");
                    System.out.println("*     System.out.println(m);  // Bucle infinito, la condición      *");
                    System.out.println("*        nunca se cumple                                           *");
                    System.out.println("*     }                                                            *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

        }


       public static void ejemplodebuclesforeach(){

                    System.out.println("********************************************************************");
                    System.out.println("*************    Ejemplo de bucles For-Each    *********************");
                    System.out.println("********************************************************************");
                    System.out.println("* public class BucleFor {                                          *");
                    System.out.println("*      public static void main(String args[]) {                    *");
                    System.out.println("*      int[] numbers = { 1, 2, 3 };                                *");
                    System.out.println("*       for(int   // Tipo de variable primitiva de la lista        *");
                    System.out.println("*        que vamos a iterar                                        *");
                    System.out.println("*           number  // Nombre de la variable local                 *");
                    System.out.println("*      : numbers) {  // Nombre de la lista que vamos a iterar      *");
                    System.out.println("*           System.out.print(number + ' ');                        *");
                    System.out.println("*       }                                                          *");
                    System.out.println("*   }                                                              *");
                    System.out.println("*                                                                  *");
                    System.out.println("********************************************************************");

       }
}