/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeros[], i, cantidadPares, cantidadImpares,sumaPares, sumaImpares;
        numeros = new int[20];
        cantidadPares = 0;
        cantidadImpares = 0;
        sumaPares = 0;
        sumaImpares = 0;

        for (i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (i = 0; i < 20; i++) {

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