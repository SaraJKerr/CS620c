/** The Add_Product application assigns values to X, Y and Z. It then
 * calculates the sum of X, Y and Z, the product of X, Y and Z and
 * then adds the sum and the product together
 */
 // access and file name
 public class Add_Product // missed out class!! muppet
 {
	// method statement
	public static void main(String[] args)
	{
		// sequential instructions for the program
		int X = 42;
		int Y = 13;
		int Z = 127;
		int result1 = X + Y + Z;
		int result2 = X * Y * Z;
		int result3 = result1 + result2;
		
		// instructions for the output
		System.out.println("X: " + X + "\n" + "Y: " + Y + "\n" + "Z: " + Z);
		// \n needs to be in " otherwise it isn't recognised
		System.out.println("The sum of X, Y and Z is: " + result1);
		System.out.println("The product of X, Y and Z is: " + result2);
		System.out.println("The sum of the sum and product of X, Y and Z is: " + result3);
	}
}	