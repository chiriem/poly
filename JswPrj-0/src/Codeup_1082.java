import java.util.Scanner;

public class Codeup_1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = sc.next();
		
		int a = Integer.parseInt(num, 16);
		
		for (int i = 1; i < 16; i++) {
			System.out.printf("%X*%X=%X\n", a, i, a*i);
		}
	}

}
