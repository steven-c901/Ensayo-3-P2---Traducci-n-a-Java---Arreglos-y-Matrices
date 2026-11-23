/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][], modificada[][], i, j;
        matriz = new int[3][5];
        modificada = new int[3][5];

        System.out.println("INGRESO DE LA MATRIZ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {

                System.out.print("Ingrese el numero para la fila "
                        + i + " y columna " + j + ": ");

                matriz[i][j] = sc.nextInt();

                modificada[i][j] = (matriz[i][j] + i) * j;
            }
        }

        System.out.println("\nMATRIZ ORIGINAL:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMATRIZ MODIFICADA:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(modificada[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}