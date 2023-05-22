import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        double per = 1;
        int i = str.length();
        while (i>1){
            per = per *i;
            i--;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int j = 0; j < str.length(); j++){
            if (map.containsKey(str.charAt(j))){
                map.put(str.charAt(j),map.get(str.charAt(j))+1);
            }
            else{
                map.put(str.charAt(j),1);
            }
        }
        Set<Character> set = map.keySet();
        for (Character c : set){
            per = per*1.0 / map.get(c);
        }
        System.out.print((int)per);
    }
}

