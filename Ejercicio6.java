/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matriz[][], i,j;
        matriz = new int[3][4];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Ingrese el número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Matriz ingresada ---");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}