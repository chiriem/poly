import java.util.Scanner;

public class Ex07_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;

		while (true) {
			System.out.print("���� ù ��° �� �Է� : ");
			a = sc.nextInt();
			System.out.print("���� �� ��° �� �Է� : ");
			b = sc.nextInt();

			System.out.println(a + " + " + b + " = " + (a + b));

			if (a + b > 10) {
				System.out.println("����!");
				break;
			}
		}

	}

}
