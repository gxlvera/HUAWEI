import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            if (a!=0){
                System.out.println(Drink.drinkHowMany(a));
            }
        }
    }

    public static class Drink {

        public Drink(){

        }

        public static int drinkHowMany(int n){
            if (n==1){
                return 0;
            }
            else if (n==2){
                return 1;
            }
            return (n/3+drinkHowMany(n/3 + n%3));
        }

    }
}