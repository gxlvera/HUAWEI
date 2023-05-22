public class Drink {

    public static int drinkHowMany(int n){
        if (n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        return (n/3+drinkHowMany(n/3 + n%3));
    }
    public static void main(String[] args) {
        System.out.println(Drink.drinkHowMany(11));
    }
}
