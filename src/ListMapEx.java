import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Iterator;

public class ListMapEx {

	public static void main(String[] args) {
		
		//HashMap을 저장하기 위한 List 컬렉션 객체를 메모리에 생성
		List<HashMap<String, String>> rList = new ArrayList<>();
		
		HashMap<String, String> pMap = new HashMap<>();
		
		//키와 값을 쌍으로 데이터 추가
		pMap.put("name", "장석원");
		pMap.put("email", "m23@");
		pMap.put("addr", "일산");
		pMap.put("dept", "데분");
		
		//장석원 정보가 저장된 HashMap 객체를 List객체에 저장
		rList.add(pMap);
		
		//장석원 정보저장으로 인해 사용이 끝난 HashMap 변수를 메모리에서 삭제
		pMap = null;
		
		//홍길동 정보를 저장하기 위해 기존 HashMap 변수에 새롭게 메모리에 올림.
		pMap = new HashMap<>();
		
		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "서울");
		pMap.put("dept", "시각화과");
		
		//홍길동 정보가 저장된 HashMap 객체를 List객체에 저장
		rList.add(pMap);
		
		//홍길동 정보저장으로 인해 사용이 끝난 HashMap 변수를 메모리에서 삭제
		pMap = null;
		
		Iterator<HashMap<String, String>> it = rList.iterator();
		
		while (it.hasNext()) {
			HashMap<String, String> rMap = it.next();
			
			System.out.println("##### 반복시작 #####");
			System.out.println("name : " + rMap.get("name"));
			System.out.println("email : " + rMap.get("email"));
			System.out.println("addr : " + rMap.get("addr"));
			System.out.println("dept : " + rMap.get("dept"));
			
			rMap = null;
			System.out.println("##### 반복시작 #####");
		}
	}

}
