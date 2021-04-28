import java.util.Scanner;

public class Codeup_1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int i =0;
		while (true) {
			i++;
			if ( i%3 != 0) {
				System.out.print(i + " ");
			}
			if (i == num) {
				break;
			}
		}
	}

}
