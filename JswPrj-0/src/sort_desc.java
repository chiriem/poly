import java.util.ArrayList;
import java.util.Collections;

class sort_desc {
    public long solution(long n) {
        long answer = 0;
        
        String s = Long.toString(n);
        
        String[] ss = s.split("");
        
        ArrayList<String> rList = new ArrayList<>();
        
        for (int i = 0; i < ss.length; i++){
            rList.add(ss[i]);
        }
        
        Collections.sort(rList);
        String tmp = "";
        
        for (int i = rList.size() - 1; i > -1; i--){
            tmp = tmp + rList.get(i);
        }
        
        answer = Long.parseLong(tmp);
        
        return answer;
    }
}