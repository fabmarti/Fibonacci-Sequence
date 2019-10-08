import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numbers = 0;
		
		while(numbers < 1) {
			System.out.println("How many numbers of the Fibonacci sequence to display?");
			numbers = sc.nextInt();
		}
		
		// Iterative Fibonacci Sequence
		System.out.print("\nIterative Fibonacci Sequence: ");
		long itrStartTime = System.nanoTime();
		itrFibSequence(numbers);
		long itrEndTime = System.nanoTime();
		long itrElapsedTime = itrEndTime - itrStartTime;
		System.out.println("\nTime: " + itrElapsedTime);
		
		// Recursive Fibonacci Sequence
		System.out.print("\nRecursive Fibonacci Sequence: ");
		long recStartTime = System.nanoTime();
		for(int i = 0; i < numbers; i++)
			System.out.print(recFibSequence(i) + " ");
		long recEndTime = System.nanoTime();
		long recElapsedTime = recEndTime - recStartTime;
		System.out.println("\nTime: " + recElapsedTime);
		
		sc.close();
	}

	public static void itrFibSequence(int numOfSteps) {

		if (numOfSteps == 0 || numOfSteps == 1)
			System.out.print(1);

		else {
			int n1 = 0;
			int n2 = 1;
			int value;

			for (int i = 0; i < numOfSteps; i++) {

				value = n1 + n2;
				n2 = n1;
				n1 = value;
				
				System.out.print(value + " ");
			}
		}
		
	}

	public static int recFibSequence (int n) {
		if (n == 0 || n == 1)
			return 1;
		
		return recFibSequence(n-2) + recFibSequence(n-1);
			
	}

}
