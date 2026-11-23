/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma = suma + matriz[i][j];
            }
        }

        System.out.println("\n--- Matriz ingresada ---");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma total de todos los elementos: " + suma);

        sc.close();
    }
}
