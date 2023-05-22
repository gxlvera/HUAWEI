import java.util.ArrayList;
import java.util.TreeMap;

public class MedianFinder {

    private TreeMap<Integer,Integer> map;
    ArrayList<Integer> list;

    public MedianFinder() {
     this.map = new TreeMap();
     this.list = new ArrayList<>();
    }
    public void addNum(int n){
        if (map.containsKey(n)){
            map.put(n,map.get(n)+1);
        }
        else{
            map.put(n,1);
        }
    }
    private void renderList(){
        ArrayList<Integer> newList  = new ArrayList<>();
        for (int n : map.keySet()){
            for (int i = 0; i<map.get(n); i++){
                newList.add(n);
            }
        }
        this.list = newList;
    }
    public double findMedian(){
        this.renderList();
        if (list.size()%2 == 0){
            return (list.get((list.size()-1)/2)+list.get(list.size()/2))/2.0;
        }
        else{
            return list.get(list.size()/2)*1.0;
        }
    }
    public static void main(String[] args) {
        MedianFinder md = new MedianFinder();
        int[] nums = {1,2,3,4,5};
        for (int i : nums){
            md.addNum(i);
        }
        System.out.println(md.findMedian());
        md.addNum(4);
        System.out.println(md.findMedian());
        md.addNum(2);
        System.out.println(md.findMedian());
    }
}
