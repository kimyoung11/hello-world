import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {

		while (true) {
			
			Scanner scanner= new Scanner(System.in);	
			int num=scanner.nextInt();
			
			
			if (num >= 2 && num <= 9) {
				for(int i=1;i<10;i++)
				{
					System.out.println(num * i);
				}
				break;
			}

			else {
				System.out.println("다시 입력");
			}

		}
	}

}
