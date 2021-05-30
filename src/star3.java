
public class star3 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		while (true) {
			if (num == 0) {
				break;
			}
			sum += num % 10;
			num = num/10;
		}
		System.out.println(sum);
	}
}
