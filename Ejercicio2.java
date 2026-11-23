/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];
        double suma = 0;
        double promedio;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma = suma + numeros[i];
        }

        promedio = suma / 10;

        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);

        sc.close();
    }
}
