/* This program executes the hailstone sequence*/

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		readerBoolean();	
	}
	
	/*This method calls all other methods. 
	 * input: y or n
	 * output: hailstone program
	 */
private void readerBoolean() {

	println("This program computes Hailstone sequences.");
	println("");

	int j = 0;
	//The while loop runs if j==0, or if the user enters a y or a n. 
	while(j==0||readBoolean("Run again?","y","n")){
		//The variables here must be reset to 0 every run so they are written here, they will be reset to 0 when while is true
		/*int userNumber holds the number from the user*/
		int returnedValue = 0;
		//int i is a counter which calculates the number of times hailstone runs for the output at the end. 
		int i=0;
		//int j is a counter which decides if the run again message is displayed, and if the message is displayed it also adds a space after it
		if(j!=0) {
			//if the j counter !=0, the run again meesage was displayed and a space must be added after it for aesthetics. 
			println();
		}
		j++;
		//usernumber holds the number the user enters, and also is used in the loop to hold the intermediate values of the hailstones
		int userNumber = readInt("Enter a number:");
		/*The while loop runs while the returned value is greater than 1, or the counter is equal to 0 at the start
		 * of the hailstone sequence*/
		int oneValue =1;
		//int oneValue holds the value in case there is a one that is entered. If the value entered by the user is a 1, this value will not change. If the user enters a value other than 1, this value is mangled and the program will calculate the value of the hailstone as usual
		while(userNumber!=1&&(returnedValue>1|i==0)) {
			//the while loop decides whether the usernumber was a 1 and whether to keep executing the hailstone.If the values are not met, the hailstone is executed. 
			/*This if statement decides whether to call oddHailStone if an odd number, and evenHailStone if there is an even number*/
			if(userNumber%2==1) {
				//calls the oddHailstone and sends the userNumber, and also prints the line necessary and increments i by 1 and onevalue decrements by 1
				int oddHailOutput = oddHailStone(userNumber);
				println(userNumber+" is odd, so I make 3n+1: "+oddHailOutput);
				returnedValue = oddHailOutput;
				userNumber = oddHailOutput;
				i++;
				oneValue--;
		}
			else if(userNumber%2==0) {
				//calls the evenHailstone and sends the userNumber, and also prints the line necessary and increments i by 1 and onevalue decrements by 1
				int evenHailOutput = evenHailStone(userNumber);
				println(userNumber+" is even, so I take half: "+evenHailOutput);
				returnedValue= evenHailOutput;
				userNumber = evenHailOutput;
				i++;
				oneValue--;
		}
		}	
		if(returnedValue==1||oneValue==1) {
			println("It took "+i+" steps to reach 1.");
//this if statement executes if the user enters 1 and the while loop above was not executed
		}
	}
	println("Thanks for using Hailstone.");
}

/* This method calculates the value of the hailstone if the number that is intermediate or entered was odd
 * input: An odd number
 * output: caculated odd hailstone*/
private int oddHailStone(int hailStone) {
	int oddHails = 3*hailStone+1;
	return(oddHails);
}
/* This method calculates the value of the hailstone if the number that is intermediate or entered was even
 * input: An even number
 * output: caculated even hailstone*/
private int evenHailStone(int hailStone) {
	int evenHails = (int)((0.5)*(double)hailStone);
	return(evenHails);
}
}
