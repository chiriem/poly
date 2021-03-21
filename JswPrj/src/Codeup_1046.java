import java.util.Scanner;

public class Codeup_1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double pyoung = (a+b+c)/3;
		System.out.println((int) (a+b+c));
		System.out.printf("%.1f", pyoung);
	}

}
