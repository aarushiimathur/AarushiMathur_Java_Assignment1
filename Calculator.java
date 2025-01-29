import java.util.Arrays;
class Calculator {
    int sum(){
        UserInput ui = new UserInput(); // object creation
        int[] numbers = ui.userInput(); // store the array returned by userInput
        int sum = numbers[0] + numbers[1];
        return sum;
	}
	int diff(){
		UserInput ui = new UserInput(); 
        int[] numbers = ui.userInput(); 
        int diff = numbers[0] - numbers[1];
        return diff;
	}
	int mul(){
		UserInput ui = new UserInput(); 
        int[] numbers = ui.userInput(); 
        int mul = numbers[0] * numbers[1];
        return mul;
	}
	int div(){
		UserInput ui = new UserInput(); 
        int[] numbers = ui.userInput(); 
        int div = numbers[0] / numbers[1];
        return div;
	}
	void fibonacci() {
        UserInput ui = new UserInput();
        int n = ui.userInputForFibonacci();
        int[] fibSeries = fib(n);

        System.out.println("\nFibonacci Series: " + Arrays.toString(fibSeries));
        System.out.println("Sum of Fibonacci Series: " + sumArray(fibSeries));
        System.out.println("Mean of Fibonacci Series: " + meanArray(fibSeries));
        System.out.println("Variance of Fibonacci Series: " + varianceArray(fibSeries));
        System.out.println("Standard Deviation of Fibonacci Series: " + stdDeviationArray(fibSeries));
    }

    int[] fib(int n) {
        int[] fibSeries = new int[n];
        if (n > 0) fibSeries[0] = 0;
        if (n > 1) fibSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }
        return fibSeries;
    }

    int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    double meanArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }

    double varianceArray(int[] arr) {
        double mean = meanArray(arr);
        double sum = 0;
        for (int num : arr) {
            sum += Math.pow(num - mean, 2);
        }
        return sum / arr.length;
    }

    double stdDeviationArray(int[] arr) {
        return Math.sqrt(varianceArray(arr));
    }
}
