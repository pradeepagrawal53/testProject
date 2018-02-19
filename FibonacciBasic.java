import java.util.*;

public class FibonacciBasic {
    
    /**
    *   Calculate and print out n-th Fibonacci number.
    *   @param int number to calculate its Fibonacci number.
    *   @return long Fibonacci of n.
    */
    static long getFib(int number) {
        long previousNumber = 1;
        long currentNumber = 0;
        long sumOfNumber = 0;
        long timeStart = System.nanoTime();
        for(int n = 0; n < number; n++) {
            sumOfNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = sumOfNumber;
        }
        long timeEnd = System.nanoTime();
        int timeTaken =  (int) ((timeEnd - timeStart) / 1000000);
        System.out.format("Time taken to caluclate Fibonacci number is"
                          + " %dms \n", timeTaken);
        return sumOfNumber;
    }
    public static void main(String[] args) {
        System.out.format("Fibonacci of %d is %d\n", Integer.MAX_VALUE
                        , getFib(Integer.MAX_VALUE));
    }
}