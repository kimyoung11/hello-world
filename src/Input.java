import java.util.Scanner;

public class Input {

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

}
