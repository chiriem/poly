
public class kim {
	public String solution(String[] seoul){
		String answer = "Kim";
		
		int x = 0;
        while (true){
            if (seoul[x].contentEquals(answer)){
                break;
            }
            x++;
        }
        
        answer =  "김서방은 " + x + "에 있다";
        
        return answer;
	}
	

	public static void main(String[] args) {
		kim k = new kim();
		
		
		
		String[] a = {"jane", "Kim"};
		
		String b = k.solution(a);
		
		System.out.println(b);
	}
}
