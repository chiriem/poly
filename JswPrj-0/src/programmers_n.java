import java.util.*;

public class programmers_n {
	public int[] solution(long n) {
		String str = Long.toString(n);
		int jarisu = str.length();
		long m = n;
		int[] answer = new int[jarisu];
		for (int i = 0; i< jarisu; i++) {
			answer[i] = (int)(m%10);
			m = m/10;
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		programmers_n ac = new programmers_n();
		
		long a = sc.nextLong();
		
		int b [] = ac.solution(a);
		
		String c = Long.toString(a);
		int surija = c.length();
		for (int i = 0; i < surija; i++) {
			System.out.print(b[i]);
		}
	}

}
