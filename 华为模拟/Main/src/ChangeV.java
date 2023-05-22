import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChangeV {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        Scanner sc  = new Scanner (System.in);
        String str = sc.next();
        String outFirst = "";
        if (!set.contains(str.charAt(0))){
            Character s = str.charAt(0);
            String st = s.toString();
            outFirst+=st.toLowerCase();
        }
        if(!outFirst.equals("")){
            if (set.contains(outFirst.charAt(0))){
                outFirst = outFirst.toUpperCase();
            }
        }
        else{
            Character s = str.charAt(0);
            String st = s.toString();
            outFirst += st.toUpperCase();
        }
        for (int i = 1; i<str.length();i++){
            Character s = str.charAt(i);
            String st = s.toString();
            if (set.contains(str.charAt(i))){
                st = st.toUpperCase();
            }
            outFirst+=st;
        }
        System.out.print(outFirst);
        while (sc.hasNext()){
            String str2 = sc.next();
            String outNext = "";
            if (!set.contains(str2.charAt(0))){
                Character s = str2.charAt(0);
                String st = s.toString();
                outNext+=st.toLowerCase();
            }
            if(!outNext.equals("")){
                if (set.contains(outNext.charAt(0))){
                    outNext = outNext.toUpperCase();
                }
            }
            else{
                Character s = str2.charAt(0);
                String st = s.toString();
                outNext += st.toUpperCase();
            }
            for (int i = 1; i<str2.length();i++){
                Character s = str2.charAt(i);
                String st = s.toString();
                if (set.contains(str2.charAt(i))){
                    st = st.toUpperCase();
                }
                outNext+=st;
            }
            System.out.print(" "+outNext);
        }
    }
}