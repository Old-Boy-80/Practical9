

public class Practical9_1 {
    public static void main(String[] args) {
        int [] randomValues = new int[5];
        for(int i = 0; i < 5; i++) {
            randomValues[i] = (int) (System.nanoTime()%100) + 1;
        }
        
        double totalTimeIteration = 0;
        for(int i = 0; i < randomValues.length; i++) {
            long startTime = System.nanoTime();
            factorial(randomValues[i]);
            long endTime = System.nanoTime();
            totalTimeIteration += endTime - startTime;
        }
        System.out.println("Average Iteration Time: "+totalTimeIteration/randomValues.length + " ns");

        double totalTimeRecursion = 0;
        for(int i = 0; i < randomValues.length; i++) {
            long startTime = System.nanoTime();
            recursionFactorial(randomValues[i]);
            long endTime = System.nanoTime();
            totalTimeRecursion += endTime - startTime;
        }

        System.out.println("Average Recursion Time: "+totalTimeRecursion/randomValues.length + " ns" + '\n');

        if(totalTimeIteration > totalTimeRecursion) {
            System.out.println("Recursion is more faster than Iteration.\n");
        } else if (totalTimeIteration == totalTimeRecursion) {
            System.out.println("It is a draw!\n");
        } else {
            System.out.println("Iteration is more faster than Recursion.\n");
        }

    }

    static int factorial(int num) {
        if(num < 1) {
            return 1;
        }
        int fact = 1;
        for(int i = num; i > 1; i--) {
            fact*=i;
        }
        return fact;
    }

    static int recursionFactorial(int num) {
        if(num < 1) {
            return 1;
        }
        return num * recursionFactorial(num - 1);
    }

}