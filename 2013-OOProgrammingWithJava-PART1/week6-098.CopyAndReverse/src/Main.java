
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        
        
        int[] original = {1, 2, 3, 4};
        int[] coppied = copy(original);
        
        coppied[0] = 99;
        
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(coppied));
    }
    
    public static int[] copy(int[] array) {
            int [] copy = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                copy[i] = array[i];
            }
            return copy;
        }
    
    public static int[] reverseCopy(int[] array) {
        int [] copy = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            copy[j] = array[i];
            j++;
        }
        return copy;
    }
}

