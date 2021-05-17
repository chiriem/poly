import java.util.*;

public class kthnum {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		
		int[] tmp = {};
		
		for (int i = 0; i < commands.length; i++) {
			tmp = new int [commands[i][1] - commands[i][0] + 1];
			for (int j = 0; j < commands[i][1] - commands[i][0]+ 1; j++) {
				tmp[j] = array[commands[i][0]-1+j];
			}
			
			Arrays.sort(tmp);
			
			answer[i] = tmp[commands[i][2] - 1];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		kthnum kn = new kthnum();
		
		int[] aa = {1, 5, 2, 6, 3, 7, 4};
		int[][] bb = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] an = kn.solution(aa, bb);
		
		System.out.println(an[0]);
		System.out.println(an[1]);
		System.out.println(an[2]);
	}
}
