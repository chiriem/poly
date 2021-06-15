
public class Long_Square {

	public static void main(String[] args) {
		
		String answer = "";
		String f_answer = "";
		String s = "try hello world ";
		String[] a = s.split(" ", -1);
		
		
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length(); k++) { 
				if (k%2 == 0) {
					answer = answer + a[i].toUpperCase().charAt(k);
				} else {
					answer = answer + a[i].toLowerCase().charAt(k);
				}
			}
			answer = answer + " ";
		}
		for (int i = 0; i < answer.length() - 1; i++){
            f_answer = f_answer + answer.charAt(i);
        } 
		
		System.out.println(f_answer);
		
		
	}

}
