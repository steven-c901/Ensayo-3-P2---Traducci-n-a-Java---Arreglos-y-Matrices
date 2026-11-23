/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[5][5];
        int mayor, menor;

        System.out.println("INGRESO DE LA MATRIZ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("Ingrese el numero para la fila "
                        + i + " y columna " + j + ": ");

                matriz[i][j] = sc.nextInt();
            }
        }


        mayor = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMATRIZ INGRESADA:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);

        sc.close();
    }
}
