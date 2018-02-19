public class totalSum {
    /**
    *   Calculate the sum of number 1 to n.
    *   @param integer number n.
    *   @return integer total sum of number.
    */
    private static int totalSumOfNumber (final int number) {
        int totalSum = number * (number + 1) / 2;
        return  totalSum;
    }

    public static void main(String[] args) {
        long timeStart = System.nanoTime();
        System.out.format("The total sum from 1 to 100 is %d.\n", totalSumOfNumber(100));
        long timeEnd = System.nanoTime();
        long timeTaken = timeStart - timeEnd;
        System.out.format("Time taken to run the program is %d.\n", timeTaken);

    }
}