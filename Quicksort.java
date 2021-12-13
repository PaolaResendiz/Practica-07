/**
 * Clase Quicksort
 * Clase que implementa el algoritmo quicksort para 100000 elemntos
 * @author Brenda Paola Resendiz
 * @version 1.0
 */
import java.util.Random;

public class Quicksort {

    /**
     * Método quickSort que nos permite ordenar un arreglo de numeros enteros 
     * con el ordenamiento quicksort
     *
     * @param vector Segmento que se toma del arreglo
     * @param izquierda Realiza la busqueda de izquierda a derecha
     * @param derecha Realiza la busqueda de derecha a izquierda
     */
    public static void quickSort(int[] vector, int izquierda, int derecha) {
        int pivote = vector[izquierda];
        int i = izquierda;
        int j = derecha;
        int auxIntercambio;
        while (i < j) {
            while (vector[i] <= pivote && i < j) {
                i++;
            }
            while (vector[j] > pivote) {
                j--;
            }
            if (i < j) {
                auxIntercambio = vector[i];
                vector[i] = vector[j];
                vector[j] = auxIntercambio;
            }
        }
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        if (izquierda < j - 1) {
            quickSort(vector, izquierda, j - 1);
        }
        if (j + 1 < derecha) {
            quickSort(vector, j + 1, derecha);
        }
    }

    /**
     * Método principal donde damos la logitud y los elemntos del arreglo de
     * números enteros
     * @param args Argumentos
     */
    public static void main(String[] args) {
        int[] numeros = new int[100000];
        Random rnd = new Random();
        System.out.println("Vector desordenado");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(1000);
            System.out.print(numeros[i] + " ");
        }   
        Quicksort.quickSort(numeros, 0, numeros.length - 1);
        System.out.println("\nVector Ordenado");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

    }
}
