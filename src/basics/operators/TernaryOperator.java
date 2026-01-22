package basics.operators;

public class TernaryOperator {
	public static void main(String[] args) {

		int score = 75;
		int passingGrade = 50;

		// Requirement: If score is >= passingGrade, result is "Pass", else "Fail"

		// Using Ternary instead of a long if-else block
		String result = (score >= passingGrade) ? "Pass" : "Fail";

		System.out.println("Exam Result: " + result);

		// Another example: Finding the maximum of two numbers
		int num1 = 15;
		int num2 = 30;

		int max = (num1 > num2) ? num1 : num2;

		System.out.println("The larger number is: " + max);

		// Example with Booleans
		boolean isRaining = true;
		String action = (isRaining) ? "Take an umbrella" : "Enjoy the sun";

		System.out.println("Today's advice: " + action);
	}
}