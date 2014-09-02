/* Pseudocode instructions to complete integer tasks
*/
// access and NameOfFile  
public class IntegerTasks
{
	// method statement - 
	public static void main(String[] args)
	{
		//assign values to numbers X,Y and Z;
			int X = 10;
			int Y = 43;
			int Z = 15;
			int result = X + Y + Z; // don't forget the semi-colon - needed as + coerced the result into a string
		//use print statement to print values for X,Y and Z;
			System.out.println("X: " + X);
			System.out.println("Y: " + Y);
			System.out.println("Z: " + Z);
		//use print statement to print result of sum(X,Y,Z);
			System.out.println("The sum of X, Y and Z is: " + result); // The + coerces the additions to String so need to separate it
		//use print statement to print result of product (X, Y, Z);
			System.out.println("The product of X, Y, Z is: " + X * Y * Z); // This is ok as * doesn't affect strings
	}
}
