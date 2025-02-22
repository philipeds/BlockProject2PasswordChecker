import java.util.Scanner;

public class PasswordChecker {
	
	private static int evaluatePassword(String password) {
		String specialCharacterExpression = "[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]";
		String lowercaseExpression = ".*[a-z].*";
		String uppercaseExpression = ".*[A-Z].*";
		String numbersExpression = ".*\\d.*";
		int passwordScore = 0;
		int passwordLength = password.length();
		if (passwordLength >= 12) {
			passwordScore += passwordLength; 
		}
		if (password.matches(specialCharacterExpression)) {
			passwordScore += 5;
		}
		if (password.matches(lowercaseExpression) && password.matches(uppercaseExpression)) {
			passwordScore += 5;
		}
		if (password.matches(numbersExpression)) {
			passwordScore += 5;
		}
		return passwordScore;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("Password Checker");
        System.out.println("Passwords are graded on their complexity - specifically, their length and use of characters such as numbers, symbols, lowercase"
        		+ "and uppercase letters.");
        System.out.println("Please enter password:");
        String inputPassword = s.nextLine();
        System.out.println("Evaluating your password: " + inputPassword);
        System.out.println("Note: A password score above 20 is considered very strong.");
        s.close();
        int passwordScore = evaluatePassword(inputPassword);
        System.out.println("Your password's strength score: " + passwordScore);
	}
}
