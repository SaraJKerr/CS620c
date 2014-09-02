/**
 * The conString class implements an application that
 * concatenates two string variables to standard output.
 * The String variables are created using = to 
 * assign the content to Str1 and Str2
 */
 class conString
 {
	public static void main(String[] args)
	{
		String Str1 = "Hello World! This is a string variable.";
		String Str2 = "Added to a second string variable. This is called concatenation.";
		String BigStr = Str1 + " " + Str2;
		System.out.println(BigStr);
	}
}