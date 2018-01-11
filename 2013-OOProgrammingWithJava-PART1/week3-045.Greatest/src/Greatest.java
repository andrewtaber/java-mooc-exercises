
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {

        int compare1 = Math.max(number1, number2);
        int compare2 = Math.max(compare1, number3);
        return compare2;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}