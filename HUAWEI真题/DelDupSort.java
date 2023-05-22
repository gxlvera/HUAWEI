import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class DelDupSort {
    public static Set<Integer> DelAndSort(int[] nums){
        Set<Integer> set = new TreeSet<>();
        for (int i : nums){
            set.add(i);
        }
        return set;
    }
    public static void main(String[] args) {
        int[] nums = {1,20,1,3,4,9,5,5,5,5,9,10};
        System.out.println(DelAndSort(nums));
    }
}
