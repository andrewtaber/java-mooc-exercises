/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class DistributionHelper {
    
    public static void initialize(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }
   
    public static void printDistribution(int[] array) {
        System.out.print("Grade distribution:");
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println();
            System.out.print(i + ": ");
            for(int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    
}
