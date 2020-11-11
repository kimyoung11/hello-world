import java.util.Scanner;

public class Calculator {

	static int getFirstValue(Scanner scanner) {
		System.out.println("첫번째 입력 값");
		int first = scanner.nextInt();
		return first;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력 값");
		int second = scanner.nextInt();
		return second;

	}

	static String getSymbol(Scanner scanner) {
		System.out.println("사칙연산 기호 입력");
		String symbol = scanner.next(); // 문자 1개
		return symbol;
	}

	static int calculate(int first, String symbol, int second) {

		int result = 0;
		if (symbol.equals("+")) {
			result = first + second;
		} else if (symbol.equals("-")) {
			result = first - second;
		} else if (symbol.equals("*")) {
			result = first * second;
		} else if (symbol.equals("/")) {
			result = first / second;
		} else
			System.out.println("사칙 연산 기호가 아닙니다");

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = getFirstValue(scanner);

		int result = first;
		while (true) {
			String symbol = getSymbol(scanner);
			if (symbol.equals("quit")) {
				System.out.println("최종결과값" +result);
				break;
			}
			int second = getSecondValue(scanner);

			result = calculate(result, symbol, second);
			System.out.println(result);
		}

	}
}
