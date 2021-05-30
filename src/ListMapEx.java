import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;

public class ListMapEx {

	public static void main(String[] args) {
		
		//HashMap�� �����ϱ� ���� List �÷��� ��ü�� �޸𸮿� ����
		List<HashMap<String, String>> rList = new ArrayList<>();
		
		HashMap<String, String> pMap = new HashMap<>();
		
		//Ű�� ���� ������ ������ �߰�
		pMap.put("name", "�弮��");
		pMap.put("email", "m23@");
		pMap.put("addr", "�ϻ�");
		pMap.put("dept", "����");
		
		//�弮�� ������ ����� HashMap ��ü�� List��ü�� ����
		rList.add(pMap);
		
		//�弮�� ������������ ���� ����� ���� HashMap ������ �޸𸮿��� ����
		pMap = null;
		
		//ȫ�浿 ������ �����ϱ� ���� ���� HashMap ������ ���Ӱ� �޸𸮿� �ø�.
		pMap = new HashMap<>();
		
		pMap.put("name", "ȫ�浿");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "����");
		pMap.put("dept", "�ð�ȭ��");
		
		//ȫ�浿 ������ ����� HashMap ��ü�� List��ü�� ����
		rList.add(pMap);
		
		//ȫ�浿 ������������ ���� ����� ���� HashMap ������ �޸𸮿��� ����
		pMap = null;
		
		Iterator<HashMap<String, String>> it = rList.iterator();
		
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();
			
			System.out.println("##### �ݺ����� #####");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));
			
			rMap = null;
			System.out.println("##### �ݺ����� #####");
		}
	}

}
