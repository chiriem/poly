import java.util.Scanner;

public class Codeup_1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int sum = 0;
		int i=0;
		while(true) {
			sum += i;
			if (sum >= num) {
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
