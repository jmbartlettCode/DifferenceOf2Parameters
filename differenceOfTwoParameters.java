/*
 * Josh Bartlett
 * Purpose: To return the difference of two parameters with overloaded methods
 * May 17, 2019
 * Bellevue University
 * differenceOfTwoParameters.java
 */

import static java.lang.Math.abs;

public class differenceOfTwoParameters {
    public static void main(String[] args){
        
        // Calls the first difference method and displays result 
        System.out.println("The difference of 10 and 1 is " + 
                difference(10, 1));
        
        // Calls the second difference method and displays result
        System.out.println("The difference of 9.2 and 3.7 is " + 
                difference(9.2, 3.7));
        
        // Calls the third difference method and displays result
        System.out.println("The difference of 9 and 2.3 is " + 
                difference(9, 2.3));
        
        // Calls the fourth difference method and displays result
        System.out.println("The difference of 9.7 and 2 is " + 
                difference(9.7, 2));
    }
    
    // Method for difference of two ints
    public static int difference(int x, int y){
        int d = x - y;
        return abs(d);
    }
    
    // Method for difference of two doubles
    public static double difference(double x, double y){
        double d = x - y;
        return abs(d);
    }
    
    // Method for difference of an int and a double
    public static double difference(int x, double y){
        double d = x - y;
        return abs(d);
    }
    
    // Method for difference of a double and an int
    public static double difference(double x, int y){
        double d = x - y;
        return abs(d);
    }
}
