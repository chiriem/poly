import java.util.Scanner;

public class Codeup_1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		
		System.out.printf("%d\n",(int) (a+b));
		System.out.printf("%d\n",(int) (a-b));
		System.out.printf("%d\n",(int) (a*b));
		System.out.printf("%d\n",(int) (a/b));
		System.out.printf("%d\n",(int) (a%b));
		System.out.printf("%.2f", a/b);
	}

}
