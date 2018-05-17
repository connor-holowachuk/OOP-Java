import java.util.Scanner;

public class FirstProgram {

	public static void main(String args[]) {

		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Henlo good sir/madam, plez do tell me your number:");
		int givenNumber = inputScanner.nextInt();

		PrimeChecker checker = new PrimeChecker(givenNumber);

		int nextPrimeNum = checker.getNextPrime();

		System.out.println("Whoa no way, the next prime number is: " + nextPrimeNum);
	
		inputScanner.close();

	}
}