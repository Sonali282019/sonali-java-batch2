// Java program to validate a username
// using Regular Expression or ReGex

import java.util.regex.*;

class ABC {

	// Function to validate the username
	public static boolean isValidUsername(String name)
	{

		// Regex to check valid username.
		String regex = "^[A-Za-z]\\w{5,29}$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the username is empty
		// return false
		if (name == null) {
			return false;
		}

		// Pattern class contains matcher() method
		// to find matching between given username
		// and regular expression.
		Matcher m = p.matcher(name);

		// Return if the username
		// matched the ReGex
		return m.matches();
	}

	// Driver Code
	public static void main(String[] args)
	{

		// Test Case: 1
		String str1 = "SonaliMahato";
		System.out.println(isValidUsername(str1));

		// Test Case: 2
		String str3 = "SonaliMahato03";
		System.out.println(isValidUsername(str3));

		// Test Case: 3
		String str5 = "so";
		System.out.println(isValidUsername(str5));
	}
}
