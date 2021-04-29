import java.util.Scanner;

public class Codeup_1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		for (int i = 1; i<c; i++) {
			
			a = a*b;
			
		}
		System.out.println(a);
	}
}
