package AlgoritimosSort;
public abstract class SortAlgoritmo {
    public String nomeAlgoritimo;

    public void rodarAlgoritimo(int [] array){
        
    }
    
    public void rodarAlgoritimo(int [] array, int n){
        
    }

    public void heapify(int[] array, int size) {
        for (int i = 1; i < size; i++) {
            if (array[i] > array[(i - 1) / 2]) {
                int j = i;
                while (array[j] > array[(j - 1) / 2]) {
                    swap(array, j, (j - 1) / 2);
                    j = (j - 1) / 2;
                }
            }
        }
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public int separarQuicksort(int[] vetor, int p, int inicio, int fim) {
        int l = inicio;
        int h = fim - 2;
        int piv = vetor[p];
        troca(vetor, p, fim - 1);
        while (l < h) {
            if (vetor[l] < piv) {
                l++;
            } else if (vetor[h] >= piv) {
                h--;
            } else {
                swap(vetor, l, h);
            }
        }
        int idx = h;
        if (vetor[h] < piv) {
            idx++;
        }
        swap(vetor, fim - 1, idx);
        return idx;
    }

    public void troca(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    
}