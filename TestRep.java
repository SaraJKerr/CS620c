public class TestRep
{
	public static void main(String[] args)
	{
		int x = 7;
		x += 2;
		System.out.println("x += 2 = " + x);
		int y = 4;
		y -= 2;
		x -= y;
		System.out.println("x -= y = " + x);
		int z = 3;
		x *= z;
		System.out.println("x *= z = " + x);
		x = 7;
		int result = x % 2;
		System.out.println("x % 2 = " + result);
		int quotient = 7 / 3; // yields 2
		int remainder = 7 % 3; // yields 1
		System.out.println("quotient (7/3) = " + quotient + "\n" + "remainder (7%3) = " + remainder);
	}
}