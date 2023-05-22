import java.util.Comparator;
import java.util.PriorityQueue;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Stone {
    private PriorityQueue<Integer> pq;

    public Stone (){
        pq = new PriorityQueue<>(Comparator.reverseOrder());
    }
    public int smash(int nums[]){
        for (int n : nums){
            this.pq.offer(n);
        }
        helpSmash(this.pq);
        if (pq.size() == 1){
            return pq.peek();
        }
        else {
            return 0;
        }
    }
    public void helpSmash(PriorityQueue<Integer> pq){
        if (pq.size() <=1){
            return;
        }
        int largest = pq.peek();
        pq.poll();
        int secondLargest = pq.peek();
        pq.poll();
        if (largest!=secondLargest){
            int newElement = max(largest,secondLargest) - min(largest,secondLargest);
            pq.add(newElement);
        }
        helpSmash(pq);
    }
    public static void main(String[] args) {
        Stone stone = new Stone();
        int[] nums = {2,3,10,4,3,2,1};
        System.out.println(stone.smash(nums));
    }
}
