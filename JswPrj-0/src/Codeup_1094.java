import java.util.Scanner;

public class Codeup_1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr_a[] = new int[n];
		int arr_b[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr_a[i] = sc.nextInt();
			arr_b[n-i-1] = arr_a[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr_b[i] + " ");
		}
		
	}

}
