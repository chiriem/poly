import java.util.Scanner;

public class Java_5_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력하세오 : ");
		int a = sc.nextInt();

		if (a >= 90) {
			System.out.print("A");
		} else {
			if (a >= 80) {
				System.out.print("B");
			} else {
				if (a >= 70) {
					System.out.print("C");
				} else {
					if (a >= 60) {
						System.out.print("D");
					} else {
						System.out.print("F");
					}
				}
			}
		}
		System.out.println("학점입니다.");
	}
}