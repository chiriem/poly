import java.util.ArrayList;
import java.util.List;

public class Listex {

	public static void main(String[] args) {
		
		List<String> rList = new ArrayList<>();
		
		rList.add("�弮��");
		rList.add("�輮��");
		rList.add("�̼���");
		rList.add("�ڼ���");
		
		System.out.println("�迭�� ũ�� : " + rList.size());
		
		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[ "+i+" ] ��° �迭 ������ : " + rList.get(i));
		}
		
		
	}

}
