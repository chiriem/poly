import java.util.Scanner;

public class Java_5_9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~4�߿� �����ϼ��� : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1�� �Է��ϼ����ϴ�");
			break;
		case 2:
			System.out.println("2�� �Է��ϼ����ϴ�");
			break;
		case 3:
			System.out.println("3�� �Է��ϼ����ϴ�");
			break;
		case 4:
			System.out.println("4�� �Է��ϼ����ϴ�");
			break;
		default:
			System.out.println("�̻��� �� �ϼ̳׿�?");
		}
	}
}