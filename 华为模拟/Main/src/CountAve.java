import java.util.Scanner;

public class CountAve {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        int sum = 0;
        int num = 0;
        if (sc.hasNextLine()){
            String[] arrayOfWords = sc.nextLine().split("\s");
            for (String s : arrayOfWords){
                num++;
                sum+=s.length();
            }
        }
        sc.close();
        System.out.println(String.format("%.2f",sum*1.0/num));
    }
}
