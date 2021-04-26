import java.util.Scanner;

public class Codeup_1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum = 0;
		int i = 0;
		while (true) {
			i++;
			sum = sum + i;
			if (sum >= num) {
				break;
			}
		}
		System.out.println(sum);
	}

}
