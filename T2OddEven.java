/** The T2OddEven application examines a variable and determines
 * whether it is an odd or an even number.
 */
 public class T2OddEven
 {
	public static void main(String[] args)
	{
		// create an integer variable called number with a value assigned
		int number = 3;
		// carry out a calculation to determine if the number is even
		// use % == 0
		if (number % 2 == 0)
		{
			System.out.println("The number " + number + " is EVEN");
		}
		else
		{
			System.out.println("The number " + number + " is ODD");
		}
	}
}