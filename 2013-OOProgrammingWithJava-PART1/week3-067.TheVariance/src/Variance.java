import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int listSum = 0;
        for(int number : list){
            listSum += number;
        }
        return listSum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int listSum = sum(list);
        double average = 0;
        int listSize = list.size();
        
        average = (double)listSum/listSize;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        int listSize = list.size();
        double variance = 0;
        double varianceSum = 0;
        
        for(int number : list) {
            varianceSum += Math.pow((number - average), 2);
        }
        
        variance = varianceSum/(listSize - 1);
        
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
