import java.util.Scanner;

public class Calculator {

	static int getFirstValue(Scanner scanner) {
		System.out.println("ù��° �Է� ��");
		int first = scanner.nextInt();
		return first;
	}

	static int getSecondValue(Scanner scanner) {
		System.out.println("�ι�° �Է� ��");
		int second = scanner.nextInt();
		return second;

	}

	static String getSymbol(Scanner scanner) {
		System.out.println("��Ģ���� ��ȣ �Է�");
		String symbol = scanner.next(); // ���� 1��
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
			System.out.println("��Ģ ���� ��ȣ�� �ƴմϴ�");

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = getFirstValue(scanner);

		int result = first;
		while (true) {
			String symbol = getSymbol(scanner);
			if (symbol.equals("quit")) {
				System.out.println("���������" +result);
				break;
			}
			int second = getSecondValue(scanner);

			result = calculate(result, symbol, second);
			System.out.println(result);
		}

	}
}
