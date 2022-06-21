package AlgoritimosSort;

import java.util.Stack;

public class QuickSort extends SortAlgoritmo {
    
    public QuickSort(){
        this.nomeAlgoritimo = "QuickSort";
    }

    public void rodarAlgoritimo(int[] vetor) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(vetor.length);

        while (!stack.isEmpty()) {
            int end = stack.pop();
            int start = stack.pop();
            if (end - start < 2) {
                continue;
            }
            int p = start + ((end - start) / 2);
            p = separarQuicksort(vetor, p, start, end);

            stack.push(p + 1);
            stack.push(end);

            stack.push(start);
            stack.push(p);
        }
    }
}