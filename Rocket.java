//This program creates a rocket using several different methods. Throughout the method, the SIZE constant is used to create a rocket of a desired size using only ASCII characters. To change the size of the rocket, change the size constant. 

import acm.program.*;
public class Rocket extends ConsoleProgram {
	//declaring the constant. The constant is used to decide what the size of the rocket will be and what the scale of the compnents will be. 
	int SIZE=5;
	public void run() {
		// TODO: finish this program
		rocketNoseandEngine(SIZE);
		couplingCreator(SIZE);
		rocketBody(SIZE);
		couplingCreator(SIZE);
		rocketNoseandEngine(SIZE);
		}
/*This method works to create the nosecone or engine of the rocket. The method is used for both parts since they are identical. It only outputs the forward slashes and backslashes of the nosecone or engine.
 * Input: SIZE constant tells what scale the rocket is supposed to be at. 
 * Output: A nosecone or engine for the rocket made of ASCII art.
 */
	private void rocketNoseandEngine(int SIZE2) {
		//This loop exists to run all the other loops until the rocket nosecone or engine becomes the correct size for the expected scale of the rocket.
		for(int i=1;i<=SIZE2;i++) {
			//This loop puts in the required number of spaces in front of each level of the nosecone or engine
			for(int l=(SIZE2-i+1);l!=0;l--) {
				print(" ");}
			//This loop runs the loops below it until the wanted nosecone or engine is formed.
			for(int j=0;j!=i;j++) {
				//This for loop runs until the wanted number of forward slashes is printed in the nosecone or engine .	
			print("/");}
			for(int k=0;k!=i;k++) {
				//This for loop runs until the wanted number of backward slashes is printed in the nosecone or engine. 
			print("\\");
		
	}
			//This println statement exists to start the loops on a new line each time
println();
		
	}
	
}
/*This method exists to make the coupling between the nosecone and the rocketbody and the 
 * coupling between the rocketbody and the engine. 
 * Input: SIZE constant
 * Output:A coupling made out ASCII art that is the right size for the expected scale of the rocket.
 */
	private void couplingCreator(int SIZE3) {
		//This is the first + sign of the coupling
		print("+");
		for(int i=0;i!=SIZE3*2; i++) {
			//This for loop creates the expected number of equal signs for the coupling
			print("=");
		}
		//This is the last plus sign for the coupling
		print("+");
		//This println exists so that other methods are not impacted by the coupling and are able to start on a new line
		println("");
	}
	
	private void rocketBody(int SIZE4) {
		/*This method exists to create the rocketbody. This is the component between the couplings. The rocketbody will be the correct scale for the size of the expected rocket. 
		 * Input: The Size of the rocket
		 * Output: An ASCII art Rocket body
		 */
		for(int i=1;i<=SIZE4;i++) {
			//This loop runs the other loops until the properly scaled upper half of the rocket body is created.
			print("|");
			//This places the straight line needed at the left side of the rocket body
			
			//This loop places the required number of periods in the upper half of the rocket body
			for(int j=(SIZE4-i-1);j>=0;j--) {
				print(".");}
				//This loop places the required number of slashes and backslashes in the upper half of the rocket body
				for(int k=0;k<i;k++) {
					print("/");
					print("\\");
				
			}
				for(int j=(SIZE4-i-1);j>=0;j--) {
					print(".");}
				print("|");
				//After the line is printed, this println enables printing on a new line
				println();
				}
//This for loop controls all the other for loops for creating the lower half of the rocket body
		for(int i =SIZE4;i!=0;i--) {
			print("|");
			
			//This loop places the required number of periods in the lower half of the rocket body
			for(int j=(SIZE4-i-1);j>=0;j--) {
				print(".");}
				//This loop places the required number of slashes and backslashes in the lower half of the rocket body
				for(int k=0;k<i;k++) {
					print("\\");
					print("/");
				
			}
				for(int j=(SIZE4-i-1);j>=0;j--) {
					print(".");}
				print("|");
				//After the line is printed, this println enables printing on a new line
				println();
				}
			}
			
	}