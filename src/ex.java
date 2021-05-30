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
			System.out.println("수 입력");
			
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("1입력");
				break;
			case 2:
				System.out.println("2입력");
				break;
			case 3:
				System.out.println("3입력");
				break;
			case 4:
				System.out.println("4입력");
				break;
			case 5:
				System.out.println("5입력, out");
				break;
			default:
				System.out.println("잘못된 값 입력");
				break;
			}
			
			if (num == 5) {
				break;
			}
		}
	}
}