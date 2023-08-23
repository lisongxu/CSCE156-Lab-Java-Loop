package unl.soc;

/**
 * This program demonstrates the use of various loop control structures to
 * compute the sum of natural numbers.
 * 
 * @author cbourke, Lisong
 *
 */
public class Natural {

	/**
	 * Computes the sum of natural numbers 1..n using a while loop.
	 * 
	 * @return
	 */
	public static int sumWithWhile(int n) {
		// TODO: write a while-loop to compute the sum of 1..n
		return 0;
	}

	/**
	 * Computes the sum of natural numbers 1..n using a for loop.
	 * 
	 * @return
	 */
	public static int sumWithFor(int n) {
		// TODO: write a for-loop to compute the sum of 1..n
		return 0;
	}

	public static void main(String args[]) {
		if (args.length != 1) {
			System.err.println("ERROR: expecting a single integer argument");
			System.exit(1);
		}

		Integer n = null;
		try {
			n = Integer.parseInt(args[0]);
		} catch (NumberFormatException nfe) {
			System.err.println("ERROR: expecting a single integer argument");
			System.exit(1);
		}

		System.out.println("The sum of natural numbers from 1 thru "+n+" is "+sumWithWhile(n)+" using sumWithWhile()");
		
		System.out.println("The sum of natural numbers from 1 thru "+n+" is "+sumWithFor(n)+" using sumWithFor()");
		
	}
}
