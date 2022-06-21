package AlgoritimosSort;

public class MergeSort extends SortAlgoritmo{
    public MergeSort() {
        this.nomeAlgoritimo = "MergeSort";
    }

    public void rodarAlgoritimo(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0)
            System.arraycopy(a, mid, r, 0, n - mid);

        rodarAlgoritimo(l, mid);
        rodarAlgoritimo(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
}
