import java.util.Scanner;

public class Codeup_1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		for (int i = 0; i<c-1; i++) {
			a= a+b;
		}
		System.out.println(a);
	}

}
