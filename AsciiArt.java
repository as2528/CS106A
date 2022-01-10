import acm.program.*;
//This program is meant to create a ASCII art picture of a sailboat sailing on water. The SIZE constant is used to scale up or down the sailboat to the desired size, and is used by the methods to scale the various components. 
public class AsciiArt extends ConsoleProgram {
	int SIZE = 3;
	public void run() {
		print("CS 106A ASCII Art by Ajit Singh");
		sailMaker(SIZE);
		hullMaker(SIZE);
		waterLine(SIZE);
	}
	private void sailMaker(int SIZE1) {
		//This creates the top half of the sail
		println();
		for(int i=0; i<=SIZE1; i++) {
			print(" ");
		}
		print("|\\");
	println("");
	
	//this creates the bottom half of the sail
	for(int i=0; i<=SIZE1; i++) {
		print(" ");
	}
	print("|/");

	println();
	
	//This creates the mast of the sail
	for(int i=0; i<=SIZE1; i++) {
		print(" ");
	}
	print("|");

}

private void hullMaker(int SIZE2) {
	/*This method is meant to make the hull of the boat. 
	 * Input: SIZE constant
	 * Output: ASCII art of the hull of the boat
	 */
	println();
	print("\\");
	for(int i =0; i<=SIZE2*2; i++) {
		print("--");
		//This for loop creates the top of the hull
	}
	print("/");
	println();
	print(" ");
	print("\\");
	for(int i =0; i<=SIZE2*2-1; i++) {
		print("--");
		//This for loop creates the middle section of the hull
	}
	print("/");
	println();
	print("  ");
	print("\\");
	for(int i =0; i<=SIZE2*2-2; i++) {
		print("--");
		//This for loop creates the bottom of the hull
	
}
	print("/");
}

private void waterLine(int SIZE3) {
	/*This method creates the waterline in the picture.
	 * Input: SIZE
	 * Output: ASCII art Waterline
	 */
	println();
	for(int i=0; i<SIZE3*2; i++) {
		//The for loop is meant to print out the waves multiple times. 
		print("/\\/\\");
	}
}
}