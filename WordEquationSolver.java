//  Created by Connor Holowachuk
//  May 10, 2018

// TOO + TOO + TOO + TOO = GOOD
// 4(TOO) = GOOD

public class WordEquationSolver {
	
	public static void main(String args[]) {

		int loopCount = 0, solutionCount = 0;
		System.out.println("\nProgram start.\nCalculating variables for TOO+TOO+TOO+TOO=GOOD...");

		for (int t=0;t<10;t++) {
			for (int g=0;g<10;g++) {
				for (int d=0;d<10;d++) {
					for (int o=0;o<10;o++) {
						loopCount++;

						int oo = (o * 10) + o;
						int too = (t * 100) + oo;
						int good = (g * 1000) + (oo * 10) + d;
						if ((4 * too) == good && loopCount != 1) {
							solutionCount++;
							System.out.println("\nSolution " + solutionCount + ":\nGOOD = " + good + "\nTOO = " + too + "\nCompleted in " + loopCount + " iterations.");
							
						}
					}
				}
			}
		}


		System.out.println("\nProgram exit.");
		return;

	}

}
