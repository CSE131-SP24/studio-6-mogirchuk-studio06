package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		//(0.5)^(1+n)
		double sum = 0.0;
		if (n == 1)
		{
			return 0.5;
		}
		else if (n == 0)
		{
			return 0.0;
		}
		else
		{
			sum = Math.pow(0.5, n);
		}
		return sum + geometricSum(n-1); 
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but in reverse order
	 */
	public static int[] toReversed(int[] array) {
			int[] reverse = new int[array.length];
			return helpReversed(array, reverse, array.length-1);
	}
	
	public static int[] helpReversed(int[] array, int[] reverse, int i) {
			if (i<0)
			{
				return reverse;
			}
			else 
			{
				reverse[i] = array[array.length-1-i]; 
				return helpReversed(array, reverse, i--); 
			}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius >= radiusMinimumDrawingThreshold)
		{
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter-radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter+radius, yCenter, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter-radius, radius/3.0, radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter+radius, radius/3.0, radiusMinimumDrawingThreshold);
		}
	}

}
