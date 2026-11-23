/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeros[], i, numero;
        numeros = new int[12];

        for (i = 0; i < 12; i++) {
            System.out.print("Ingrese un número positivo para la posición " + i + ": ");
            numero = sc.nextInt();

            numeros[i] = numero + i;
        }

        System.out.println("\n--- Arreglo modificado ---");

        for (i = 0; i < 12; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        sc.close();
    }
}