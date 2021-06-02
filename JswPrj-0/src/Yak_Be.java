
public class Yak_Be {
	public int[] solution(int n, int m) {
        int yak = 0;
        int be = 0;
        
        int i = 1;
        while (i <= Math.min(n,m)){
            if (n % i == 0 && m % i == 0){
                yak = i;
            }
            i++;
        }
        be = n*m/yak;
        
        
        
        int[] answer = new int[2];
        
        answer[0] = yak;
        answer[1] = be;
        
        return answer;
    }
	public static void main(String[] args) {
		Yak_Be yb = new Yak_Be();
		
		int a = 2;
		int b = 5;
		int[] c = yb.solution(a, b);
		System.out.println(c[0]);
		System.out.println(c[1]);

	}

}
