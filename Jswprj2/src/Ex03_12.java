
public class Ex03_12 {

	public static void main(String[] args) {
		char a, b, c, d, e;
		
		a = 'A';								//문자형 변수 a에 'A'를 대입한다.
		System.out.printf(" %c \t", a);
		System.out.printf(" %d \n", (int) a);	//문자형 변수 a를 문자형과 정수형으로 출력하낟.
		
		b = 'a';								//문자형 변수 b에 'a'를 대입한다.
		c = (char) (b+1);						//문자형 변수 b에 1을 더하여 문자형 변수 c에 대입, 그 결과를 char로 캐스팅한다
		System.out.printf(" %c \t", b);
		System.out.println(c);

		d = 90;									//문자형 변수 d에 숫자 90을 대입한다.
		System.out.printf(" %c \n", d);
		
		d = '가';								//문자형 변수 d에 한글을 대입한다.
		e = (char) (d+1);						//문자형 변수 d에 1을 더하여 문자형 변수 e에 대입, 결과를 char로 캐스팅한다.
		System.out.printf(" %d \t", (int) d);
		System.out.print(e);
	}

}
