
public class asdf {

	public static void main(String[] args) {
			long n = 123;
			
			String str = Long.toString(n);
			int jarisu = str.length();
			
			int[] answer = new int[jarisu];
			for (int i = 0; i< jarisu; i++) {
				answer[i] = (int)(n%10);
				n = n/10;
			}
			System.out.print(answer[0]);
			System.out.print(answer[1]);
			System.out.print(answer[2]);
		
	}

}
