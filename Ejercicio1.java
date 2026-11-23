/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\n--- Números ingresados ---");

        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        sc.close();
    }
}