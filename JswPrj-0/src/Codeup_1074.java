import java.util.Scanner;

public class Codeup_1074 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		while (true) {
			if (a == 0)
				break;
			
			System.out.println(a);
			a--;
		}
	}
}