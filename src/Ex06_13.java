import java.util.Scanner;

public class Ex06_13 {
	public static void main(String[] args) {
		/*
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "´Ü");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + "= " + i*j);
			}
			System.out.println();
		}
		*/
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j +"x"+i+"="+j*i+"	");
			}
			System.out.println();
		}
		for (int i = 0; i < a.length(); i++) {
			System.out.println(a);
		}
	}
}