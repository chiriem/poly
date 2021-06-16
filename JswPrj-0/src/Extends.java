class Plusone {
	int pone(int n) {
		int answer;
		
		answer = n + 1;
		return answer;
	}
}

class Cal extends Plusone {
	
}

public class Extends {

	public static void main(String[] args) {
		Cal cl = new Cal();
		
		int n = 5;
		
		System.out.println(cl.pone(n));
	}

}
