
public class Ex03_12 {

	public static void main(String[] args) {
		char a, b, c, d, e;
		
		a = 'A';								//������ ���� a�� 'A'�� �����Ѵ�.
		System.out.printf(" %c \t", a);
		System.out.printf(" %d \n", (int) a);	//������ ���� a�� �������� ���������� ����ϳ�.
		
		b = 'a';								//������ ���� b�� 'a'�� �����Ѵ�.
		c = (char) (b+1);						//������ ���� b�� 1�� ���Ͽ� ������ ���� c�� ����, �� ����� char�� ĳ�����Ѵ�
		System.out.printf(" %c \t", b);
		System.out.println(c);

		d = 90;									//������ ���� d�� ���� 90�� �����Ѵ�.
		System.out.printf(" %c \n", d);
		
		d = '��';								//������ ���� d�� �ѱ��� �����Ѵ�.
		e = (char) (d+1);						//������ ���� d�� 1�� ���Ͽ� ������ ���� e�� ����, ����� char�� ĳ�����Ѵ�.
		System.out.printf(" %d \t", (int) d);
		System.out.print(e);
	}

}
