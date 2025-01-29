import java.util.*;
class UserInput{
	int[] userInput(){ // return value will be an integer array
		int[] numbers = new int[2]; // declared an array called numbers with size 2
		Scanner scan = new Scanner(System.in); // initialise the scanner, system.in since input from command line
		System.out.println("Enter first number:");
		numbers[0]=scan.nextInt(); // Scan to check if its an integer value, if yes it'll save it in the array at index 0
		System.out.println("Enter first number:");
		numbers[1]=scan.nextInt();
		return numbers; // returning the array
		// Java cannot return multiple variables, hence we use the array.
		
	}
	// Making a new method for fibonacci since the input will be only one number and the output will be a series of numbers
	int userInputForFibonacci() { 
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number for Fibonacci:");
        return scan1.nextInt();
	}
}