/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matriz[][], suma,i,j;
        matriz = new int[4][4];
        suma = 0;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("Ingrese el número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Diagonal principal ---");

        for (i = 0; i < 4; i++) {

            for (j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                    suma = suma + matriz[i][j];
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

        System.out.println("\nSuma de la diagonal principal: " + suma);

        sc.close();
    }
}
