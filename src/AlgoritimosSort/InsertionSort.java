package AlgoritimosSort;

public class InsertionSort extends SortAlgoritmo {
    public InsertionSort() {
        this.nomeAlgoritimo = "InsertionSort";
    }

    public void rodarAlgoritimo(int[] array){
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > value) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = value;
        }
    }
}
