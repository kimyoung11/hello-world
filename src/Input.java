import java.util.Scanner;

public class Input {

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

}
