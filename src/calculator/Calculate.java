package calculator;

public class Calculate {

	public static void calculate(String leftString, String operator, String rightString) {
		int leftInt = 0;
		int rightInt = 0;
		int result = 0;
		
		try {
			leftInt = Integer.parseInt(leftString);
			rightInt = Integer.parseInt(rightString);
		} catch (Exception exception) {
			System.out.println("Ошибка или введены римские цифры");
			System.exit(0);
		}
		
		if (leftInt < 1 || leftInt > 10 || rightInt < 1 || rightInt > 10) {
			System.out.println("Допускаются числа от 1 до 10");
			System.exit(0);
		}
		
		if (operator.equals("+")) {
			result = leftInt + rightInt;
		}
		
		if (operator.equals("-")) {
			result = leftInt - rightInt;
		}
		
		if (operator.equals("*")) {
			result = leftInt * rightInt;
		}
		
		if (operator.equals("/")) {
			result = leftInt / rightInt;
		}
		
		System.out.println(result);
	}
	
}