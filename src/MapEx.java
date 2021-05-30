import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {

		Map<String, String> pMap = new HashMap<>();
		
		//키와 값을 쌍으로 데이터 추가
		pMap.put("name", "장석원");
		pMap.put("email", "maour23@gmail.com");
		pMap.put("dept", "데이터분석과");
		pMap.put("dept", "데이터분");
		
		//데이터 불러오기
		System.out.println("------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));
		System.out.println(pMap.get("오타"));
		System.out.println("------------------");
	}

}
