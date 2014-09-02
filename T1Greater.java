/** The T1Greater application tells the user whether a variable is
 * greater than, less than or equal to another variable.
 */
 public class T1Greater
 {
	public static void main(String[] args)
	{
		// assign values to variables
		int x = 10;
		int y = 3;
		
		// write if condition
		if (x>y) // if x is greater than y
		// add statements for desired output
		{
			System.out.println("x is " + x + "," + "y is " + y);
			System.out.println("x is greater than y");
		}
		else if (x<y) //if x is less than y
		// statement for output
		{
			System.out.println("x is " + x + "," + "y is " + y);
			System.out.println("x is less than y");
		}
		else // x is equal to y
		{
			System.out.println("x is " + x + "," + "y is " + y);
			System.out.println("x is equal to y");
		}
	}
}