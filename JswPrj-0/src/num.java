
public class num {
	public static void main(String[] args) {
		
		int n = 789;
		int answer = 0;
		while (true) {
			answer += n%10;
			n = n/10;
			if (n == 0) {
				break;
			}
		}
		System.out.println(answer);
	}
}
