import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
    private int k;
    private PriorityQueue<Integer> heap;

    public KthSmallest(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int n : nums) {
            add(n);
        }
    }

    public int add(int n) {
        if (this.heap.size()<k) {
            heap.offer(n);
        } else if (n < this.heap.peek()) {
            heap.poll();
            heap.offer(n);
        }
        return heap.peek();
    }
}
