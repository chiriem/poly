import java.util.Scanner;

public class Ex07_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("�մ�, �ֹ���?");
			System.out.println("<1>ī��� <2>��Ǫġ�� <3>�Ƹ޸�ī�� <4>����! : ");
			
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("ī��󶼸� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("īǪġ�븦 �ֹ��ϼ̽��ϴ�.");
				break;
			case 3:
				System.out.println("�Ƹ޸�ī�븦 �ֹ��ϼ̽��ϴ�.");
				break;
			case 4:
				System.out.println("�����!");
				break;
			default:
				System.out.println("�� �ֹ��Ͻô°���?");
				break;
				
			}
			
		} while(menu!=4);
	}

}
