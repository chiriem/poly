import java.util.Scanner;

public class secret {
	public String solution(String s, int n) {
		String answer = "";

		char single[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			single[i] = s.charAt(i);
		}

		char next[] = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (single[i] == ' ') {
				next[i] = ' ';
			} else if (single[i] < 91) {
				if (single[i] + n > 90) {
					next[i] = (char) (single[i] + n - 26);
				} else {
					next[i] = (char) (single[i] + n);
				}
			} else {
				if (single[i] + n > 122) {
					next[i] = (char) (single[i] + n - 26);
				} else {
					next[i] = (char) (single[i] + n); 
				}
			}
		}

		for (int i = 0; i < s.length(); i++) {
			answer = answer + next[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		secret st = new secret();
		Scanner sc = new Scanner(System.in);

		String scan = sc.nextLine();
		String some = st.solution(scan, 25);

		System.out.println(some);
	}

}
