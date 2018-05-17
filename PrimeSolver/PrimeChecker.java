public class PrimeChecker {

	public int givenNumber;

	public PrimeChecker(int givenNumber) {
		this.givenNumber = givenNumber;
	}

	public int getNextPrime() {

		boolean isPrime = false;
		int testNum = this.givenNumber;
		while (isPrime == false){
			testNum++;
			isPrime = checkIfPrime(testNum);
		}
		return testNum;
	}

	public boolean checkIfPrime(int numberToTest) {
		double maxNumDouble = Math.sqrt(numberToTest);
		int maxNum = (int) maxNumDouble;
		for (int i = 2; i <= maxNum; i++) {
			if (numberToTest % i == 0) {
				return false;
			}
		}
		return true;
	}

}