import java.util.Scanner;

public class star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마름모 변의 길이를 입력하세요 (최소값 2)");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= n-1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*(n-i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
