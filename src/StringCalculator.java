import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력 해주세요");

		String value = scanner.nextLine();
		System.out.println(value);

		String[] values = value.split(" ");

		int first = Integer.parseInt(values[0]);
		int i = 1;
		int result = first;
		while (i < values.length) {
			String symbol = values[i];

			int second = Integer.parseInt(values[i + 1]);

			int a = result = Calculator.calculate(result, symbol, second);
			System.out.println(a);
			i += 2;
		}

	}
}
