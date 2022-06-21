package AlgoritimosSort;

public class ShellSort extends SortAlgoritmo {
    
    public ShellSort(){
        this.nomeAlgoritimo = "ShellSort";
    }

    public void rodarAlgoritimo(int[] array) {
        int incremento = array.length / 2;
        while (incremento > 0) {
            for (int i = incremento; i < array.length; i++) {
                int j = i;
                int temp = array[i];
                while (j >= incremento && array[j - incremento] > temp) {
                    array[j] = array[j - incremento];
                    j = j - incremento;
                }
                array[j] = temp;
            }
            if (incremento == 2) {
                incremento = 1;
            } else {
                incremento *= (5.0 / 11);
            }
        }
    }
}

