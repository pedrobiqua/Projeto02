import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

import AlgoritimosSort.SortAlgoritmo;

public class App{
	public static void main (String[] args){
		
		/*
		aaaaaaa
		EXEMPLO DE FACTORY
		int tipo = 1;
		sort = rf.fazerOrdenacao(tipo);
            
		if (sort != null) {
        	executar(sort,new int[6]);
        }
		*/

		Scanner scanner = new Scanner(System.in);
		SortFactory rf = new SortFactory();
		SortAlgoritmo sort = null;

		System.out.println("---------- PROJETO 02 ----------");

        System.out.print("\nTamanho do conjunto: ");
        int n = scanner.nextInt();

		
		while (n > 2) {
			long start;
            float tempoQuaseOrdenado = 1, tempoDesordenado, tempoDecrescente = 1;
            int[] aleatorio, decrescente = new int[n]; 
			int[] copia = new int[n];
			int[] quaseOrdenado = new int[n];
			int tipo = 3;

			aleatorio = randomizeArray(IntStream.rangeClosed(1, n).toArray());
            System.arraycopy(aleatorio, 0, copia, 0, copia.length);
            Arrays.sort(copia);
            System.arraycopy(copia, 0, quaseOrdenado, 0, quaseOrdenado.length);
            trocarAleatorio(quaseOrdenado, 4);
            reverseArray(copia);
            System.arraycopy(copia, 0, decrescente, 0, copia.length);

            System.out.printf("%-11s%9s%12s%12s%n", "Algoritmo", "QuaseOrdenado", "Desordenado", "Decrescente");

			// HEAPSORT
			sort = rf.fazerOrdenacao(tipo);
			if( sort != null ) {
				start = System.currentTimeMillis();
				System.arraycopy(aleatorio, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
            	System.arraycopy(decrescente, 0, copia, 0, copia.length);
				executar(sort, copia);
            	tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

				System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Heapsort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);
			}

			//QUICKSORT
			sort = rf.fazerOrdenacao(1);
			if (sort != null) {
				start = System.currentTimeMillis();
				System.arraycopy(aleatorio, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(decrescente, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;

				System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Quicksort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);
			}

			// SHELLSORT
			sort = rf.fazerOrdenacao(7);
			if ( sort != null ) {
				start = System.currentTimeMillis();
				System.arraycopy(aleatorio, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(decrescente, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
				System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Shellsort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);	
			}

			// MERGE SORT
			sort = rf.fazerOrdenacao(5);
			if ( sort != null) {
				start = System.currentTimeMillis();
				System.arraycopy(aleatorio, 0, copia, 0, copia.length);
				executar(sort, copia, copia.length);
				tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(decrescente, 0, copia, 0, copia.length);
				executar(sort, copia, copia.length);
				tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
				executar(sort, copia, copia.length);
				tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
				System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Mergesort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);
			}

			// RADIX SORT
			sort = rf.fazerOrdenacao(6);
			if (sort != null) {
				start = System.currentTimeMillis();
				System.arraycopy(aleatorio, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(decrescente, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
				System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Radix Sort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);
			}

			// INSERTION SORT
			sort = rf.fazerOrdenacao(4);
			if ( sort != null) {
				start = System.currentTimeMillis();
				System.arraycopy(aleatorio, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDesordenado = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(decrescente, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoDecrescente = (float) (System.currentTimeMillis() - start) / 1000;

				start = System.currentTimeMillis();
				System.arraycopy(quaseOrdenado, 0, copia, 0, copia.length);
				executar(sort, copia);
				tempoQuaseOrdenado = (float) (System.currentTimeMillis() - start) / 1000;
				System.out.printf("%-14s%8.3f s%10.3f s%10.3f s%n", "Insertion Sort", tempoQuaseOrdenado, tempoDesordenado, tempoDecrescente);

				System.out.print("\nTamanho do conjunto: ");
				n = scanner.nextInt();
			}
		}
		scanner.close();
	}

	public static void executar(SortAlgoritmo algoritimo, int[] array){
		algoritimo.rodarAlgoritimo(array);
    }

    public static void executar(SortAlgoritmo algoritimo, int[] array ,int n){
		algoritimo.rodarAlgoritimo(array, n);
    }

	private static int[] randomizeArray(int[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomPosition = random.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomPosition];
            array[randomPosition] = temp;
        }

        return array;
    }

    /**
     * Reverte um array
     * @param array Array a ser revertido
     */
    private static void reverseArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length / 2; ++i) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    private static void trocarAleatorio(int[] array, int trocas) {
        Random r = new Random();

        int s1, s2, aux;

        for (int i = 0; i < trocas; i++) {
            s1 = r.nextInt(array.length - 1);
            s2 = r.nextInt(array.length - 1);
            aux = array[s1];
            array[s1] = array[s2];
            array[s2] = aux;
        }
    }

}
