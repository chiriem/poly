import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("손님, 주문은?");
			System.out.println("<1>카페라떼 <2>가푸치노 <3>아메리카노 <4>멈춰! : ");
			
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("카페라떼를 주문하셨습니다.");
				break;
			case 2:
				System.out.println("카푸치노를 주문하셨습니다.");
				break;
			case 3:
				System.out.println("아메리카노를 주문하셨습니다.");
				break;
			case 4:
				System.out.println("멈췄다!");
				break;
			default:
				System.out.println("뭘 주문하시는거죠?");
				break;
				
			}
			
		} while(menu!=4);
	}

}
