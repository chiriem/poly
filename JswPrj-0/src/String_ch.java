import java.util.Scanner;

public class String_ch {
	public boolean solution(String s) {
		boolean answer  = true;
		
		if (s.length() == 4 || s.length() == 6) {
			answer = true;
		} else {
			answer = false;
		}
		char [] str = new char[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			str[i] = s.charAt(i);
			
			if ((int)str[i] < 48 || (int)str[i] > 57) {
				answer = false;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		

	}

}
