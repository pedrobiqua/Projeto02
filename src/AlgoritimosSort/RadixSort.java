package AlgoritimosSort;

import java.util.ArrayList;
import java.util.List;

public class RadixSort extends SortAlgoritmo{
    public RadixSort() {
        this.nomeAlgoritimo = "Radix Sort";
    }

    public void rodarAlgoritimo(int[] array) {
        int maior = array[0];
        for (int numero : array)
            if (numero > maior)
                maior = numero;
        int digitos = 1;
        while (maior / 10 > 0) {
            maior /= 10;
            digitos++;
        }
        for (int i = 0; i < digitos; i++) {
            List<List<Integer>> subarrays = new ArrayList<>();
            for (int j = 0; j < 10; j++)
                subarrays.add(new ArrayList<>());
            for (int numero : array)
                subarrays.get((int) (numero % Math.pow(10, i + 1) / Math.pow(10, i))).add(numero);
            int j = 0;
            for (List<Integer> subarray : subarrays) {
                for (int numero : subarray) {
                    array[j] = numero;
                    j++;
                }
            }
        }
    }
}
