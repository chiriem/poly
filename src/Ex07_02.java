
public class Ex07_02 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (true) {
			sum = sum + i;
			i++;
			if (i == 11) {
				break;
			}
		}
		System.out.println(sum);
	}
}
