import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {

		Map<String, String> pMap = new HashMap<>();
		
		//Ű�� ���� ������ ������ �߰�
		pMap.put("name", "�弮��");
		pMap.put("email", "maour23@gmail.com");
		pMap.put("dept", "�����ͺм���");
		pMap.put("dept", "�����ͺ�");
		
		//������ �ҷ�����
		System.out.println("------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("��Ÿ"));
		System.out.println("------------------");
	}

}
