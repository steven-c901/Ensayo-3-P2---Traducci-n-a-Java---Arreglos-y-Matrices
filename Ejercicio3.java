/**
 *
 * @author Cando Campoverde Steven Josue
 */
package ArreglosYMatrices;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];
        int menor = numeros[0];
        int posicionMayor = 0;
        int posicionMenor = 0;

        for (int i = 1; i < 15; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i;
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Posición del mayor: " + posicionMayor);
        System.out.println("Posición del menor: " + posicionMenor);

        sc.close();
    }
}