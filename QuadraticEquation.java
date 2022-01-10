/*This program calculates the roots, or no roots of a quadratic equation using the quadratic formula. It returns the roots,
one root, or declares no roots*/

import acm.program.*;

public class QuadraticEquation extends ConsoleProgram {
	public void run() {
		double a = readInt("Enter a:");
		double b = readInt("Enter b:");
		double c = readInt("Enter c:");	
		double discriminantValueOutput = discriminantValue(a,b,c);
	
		if(discriminantValueOutput < 0) {
			println("No real roots");
		}
		else if(discriminantValueOutput==0) {
			double output = realPositiveRootsCalulator(a,b,discriminantValueOutput);
			println("One root: "+ output);
		}
		else {
			double output1 = realPositiveRootsCalulator(a,b,discriminantValueOutput);
			double output2 = realNegativeRootsCalulator(a,b,discriminantValueOutput);
			println("Two roots: "+output1+" and "+output2);
		}
	}
	
	
	/*This method calculates the positive real roots using the quadratic equation
	 * input: a,b,c values of the polynomial
	 * output: the real roots or no roots
	 * */
	private double realPositiveRootsCalulator(double a,double b,double discriminantValueOutput) {
		double realRoots = (-b+Math.sqrt(discriminantValueOutput))/(2*a);
		return(realRoots);
	
	}
	
	/*This method calculates the negative real roots using the quadratic equation
	 * input: a,b,c values of the polynomial
	 * output: the real roots or no roots
	 * */
	private double realNegativeRootsCalulator(double a,double b,double discriminantValueOutput) {
		double realRoots = (-b-Math.sqrt(discriminantValueOutput))/(2*a);
		return(realRoots);
	
	}
	
	/*This method calculates the value of the discriminant
	 * input: a,b values of the polynomial
	 * output: the value of the discriminant
	 * */
	private double discriminantValue(double a,double b, double c) {
		double discriminantValue = ((Math.pow(b,2)-4*a*c));
		return(discriminantValue);
	
	}

}