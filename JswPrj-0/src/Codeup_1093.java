import java.util.Scanner;

public class Codeup_1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr_a[] = new int[n];
		int arr_b[] = new int[24];
		
		int num = 0;
		for (int i = 0; i < n; i++) {
			arr_a[i] = sc.nextInt();
			num = arr_a[i];
			arr_b[num-1]++; 
		}
		for (int i = 0; i < 23; i++) {
			System.out.print(arr_b[i] + " ");
		}
		
	}

}
