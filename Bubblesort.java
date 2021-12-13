/**
 * Clase Bubblesort
 * Clase que implementa el algoritmo bubblesort para 100000 elementos
 * @author Brenda Paola Resendiz Mendoza
 * @version 1.0
 */
import java.util.Random;

public class Bubblesort {

    /**
     * Método principal donde vemos la longitud y los elementos del arreglo de 
     * números enteros
     * @param args Argumentos
     */
    public static void main(String[] args){
	Random rnd = new Random();
	int[] arr = new int[100000];
	for(int i = 0; i < arr.length; i++){
	    arr[i] = rnd.nextInt();
	}
	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}
	System.out.println();
	bubblesort(arr);
	for (int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}
    }
    
    /**
     * Método bubblesort que nos permite ordenar un arreglo de numeros enteros 
     * con el ordenamiento burbuja
     * @param array Formación
     */
    public static void bubblesort(int[] arr){
	
	for (int i = 0; i < arr.length; i++){
	    for(int j = 0; j < arr.length - 1; j++){
		if(arr[j] > arr[j + 1]) {
		    int temp = arr[j];
		    arr[j] = arr[j + 1];
		    arr[j + 1] = temp;
		}
	    }
	}
    }
}






