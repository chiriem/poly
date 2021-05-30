import java.util.Scanner;

public class Java_5_9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~4중에 선택하세여 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1을 입력하셨읍니다");
			break;
		case 2:
			System.out.println("2를 입력하셨읍니다");
			break;
		case 3:
			System.out.println("3을 입력하셨읍니다");
			break;
		case 4:
			System.out.println("4를 입력하셨읍니다");
			break;
		default:
			System.out.println("이상한 걸 하셨네요?");
		}
	}
}