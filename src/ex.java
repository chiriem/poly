import java.util.Scanner;

public class ex {
	public static void main(String[] args) {
		/*for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3-(i+1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2*(i+1)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5-2*(i+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~5 5=out");
		
		int num = 0;
		
		 while(true) {
			System.out.println("�� �Է�");
			
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("1�Է�");
				break;
			case 2:
				System.out.println("2�Է�");
				break;
			case 3:
				System.out.println("3�Է�");
				break;
			case 4:
				System.out.println("4�Է�");
				break;
			case 5:
				System.out.println("5�Է�, out");
				break;
			default:
				System.out.println("�߸��� �� �Է�");
				break;
			}
			
			if (num == 5) {
				break;
			}
		}
	}
}