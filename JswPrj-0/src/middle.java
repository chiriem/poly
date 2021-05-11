
public class middle {

	public String solution(String s) {
		String answer = "";
		if (s.length()%2 == 0) {
			answer += s.charAt((s.length()/2)-1);
		}
		answer += s.charAt(s.length()/2);
		
		return answer;
	}
	
	public static void main(String[] args) {
		middle md = new middle();
		
		String abc = "¿ì¸®Áý";
		String str = md.solution(abc); 

		System.out.println(str);
	}

}
