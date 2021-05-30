
public class Ex07_09 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for (int i = 1; i<=100; i++) {
			sum = sum + i;
			
			if (sum >= 1000) {
				num = i;
				break;
			}
		}
		System.out.println("1~100까지의 합에서 1000이 최초로 넘는 위치는? : "+ num);
	}

}
