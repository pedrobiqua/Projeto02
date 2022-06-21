package AlgoritimosSort;

public class HeapSort extends SortAlgoritmo{
    public HeapSort() {
        this.nomeAlgoritimo = "HeapSort";
    }

    public void rodarAlgoritimo(int[] array) {
        int n = array.length;
        heapify(array, n);

        for (int i = n - 1; i > 0; i--) {
            swap(array, 0, i);
            int j = 0, index;

            do {
                index = (2 * j + 1);
                if (index < (i - 1) && array[index] < array[index + 1])
                    index++;
                if (index < i && array[j] < array[index])
                    swap(array, j, index);

                j = index;

            } while (index < i);
        }
    }
}
