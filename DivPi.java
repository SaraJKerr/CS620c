/** The DivPi application takes three numbers (x, y and z) multiplies
 * them and then divides the result by 3.14. The three variables, their
 * product and the result of the division are returned.
 */
 public class DivPi
 {
	public static void main(String[] args)
	{
		int x = 35;
		int y = 56;
		int z = 2;
		int product = x * y * z;
		double result = product / 3.14;
		System.out.println("x: " + x + "\n" + "y: " + y + "\n" + "z: " + z);
		System.out.println("The product of x, y and z is: " + product);
		System.out.println("The product of x, y, z divided by 3.14 is: " + result);
	}
}