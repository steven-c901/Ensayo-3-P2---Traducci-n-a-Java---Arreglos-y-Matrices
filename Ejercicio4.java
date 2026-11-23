/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {

            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);

        sc.close();
    }
}