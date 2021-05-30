import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Listex2 {

	public static void main(String[] args) {

		List<String> rList = new ArrayList<>();

		rList.add("장석원");
		rList.add("김석원");
		rList.add("이석원");
		rList.add("박석원");

		System.out.println("배열의 크기 : " + rList.size());

		for (int i = 0; i < rList.size(); i++) {
			System.out.println("[ " + i + " ] 번째 배열 기억공간 : " + rList.get(i));
		}
		
		Iterator<String> it = rList.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			
			System.out.println("이름 : "+ name);
		}
	}

}
