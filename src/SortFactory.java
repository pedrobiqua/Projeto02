import AlgoritimosSort.SortAlgoritmo;
import AlgoritimosSort.HeapSort;
import AlgoritimosSort.InsertionSort;
import AlgoritimosSort.MergeSort;
import AlgoritimosSort.QuickSort;
import AlgoritimosSort.RadixSort;
import AlgoritimosSort.ShellSort;

public class SortFactory {
    public SortAlgoritmo fazerOrdenacao(int numAlgoritimo){
        if ( numAlgoritimo == 1 ) {
            return new QuickSort();
        } else if ( numAlgoritimo == 2 ) {
            return new ShellSort();
        } else if ( numAlgoritimo == 3 ){
            return new HeapSort();
        } else if ( numAlgoritimo == 4 ){
            return new InsertionSort();
        } else if ( numAlgoritimo == 5 ) {
            return new MergeSort();
        } else if ( numAlgoritimo == 6 ) {
            return new RadixSort();
        } else if ( numAlgoritimo == 7 ) {
            return new ShellSort();
        }
        return null;

    }    
}