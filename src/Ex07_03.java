import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		while (true) {
			System.out.print("더할 첫 번째 수 입력 : ");
			a = sc.nextInt();
			System.out.print("더할 두 번째 수 입력 : ");
			b = sc.nextInt();

			System.out.println(a + " + " + b + " = " + (a + b));

			if (a + b > 10) {
				System.out.println("멈춰!");
				break;
			}
		}

	}

}
