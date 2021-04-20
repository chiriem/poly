import java.util.Scanner;

public class Codeup_1083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i = 1;
		
		while (true) {
			if (i%3 != 0)
				System.out.print(i + " ");
			if (i%3 == 0)
				System.out.print("X ");
			if (i == num)
				break;
			i++;
		}
	}
}