/* This program accepts values for temperature over the last few days. The program then calculates the average, 
 highest and lowest temperatures of the list of temperatures*/


import acm.program.*;

public class Weather extends ConsoleProgram {
	/* SENTINEL is the value that when entered exits the while loop for temperatures, and is printed in the label for "to quit"*/
	private static final int SENTINEL = -42;
	
	public void run() {
		tempCheck();
		
	}
	
	/* tempCheck takes the values the user enters for the temperatures as input. 
	 * input: User temperature list
	 * output: Average temperature, lowest temperature, highest temperature
	 */
	private void tempCheck() {
		println("CS 106A \"Weather Master 4000\"!");
		int counter = 0;
		int coldCounter = 0;
		double userTemp = 0;
		double averageAdder = 0;
		double lowTemp = 0; 
		double highTemp = 0;
		boolean sentinelCheck = (userTemp != SENTINEL);
		
		while(sentinelCheck) {
			userTemp = readInt("Next temperature(or " +SENTINEL+ " to quit)?");
			sentinelCheck = sentinelCheck((int)userTemp); 
			if((userTemp<lowTemp&&sentinelCheck)||(counter==0&&sentinelCheck)) {
				lowTemp=userTemp;
			}
			if((userTemp>highTemp&&sentinelCheck)||(counter==0&&sentinelCheck)) {
				highTemp=userTemp;
			}
			if(userTemp<=50&&sentinelCheck) {
				coldCounter++;
			}
			if(sentinelCheck) {
			counter++;
			averageAdder = averageAdder+userTemp;
			}
		}
		if(counter!=0) {
			double average = averageAdder/counter;
			println("Highest temp = "+ (int)highTemp);
			println("Lowest temp = "+ (int)lowTemp);
			println("Average = "+ average);
			println((int)coldCounter+" cold day(s)");
	}
		else {
			println("No temperatures were entered.");
		}
	}
	/*The method below checks to see if the sentinel value = user temperatures for the tempcheck program to 
	 * use in it's while loops.
	 * Input: user temp and sentinel values
	 * Output: a true or false boolean value
	 */
	private boolean sentinelCheck(int userTemp) {
		boolean sentinelCheck =(userTemp != SENTINEL);
		return sentinelCheck;
	}
}
