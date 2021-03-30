import java.util.Scanner;

public class Codeup_1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a%2 == 1)
			System.out.println("odd");
		else
			System.out.println("even");
		if (b%2 == 1)
			System.out.println("odd");
		else
			System.out.println("even");
		if (c%2 == 1)
			System.out.println("odd");
		else
			System.out.println("even");
	}
}