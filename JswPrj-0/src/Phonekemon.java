import java.util.ArrayList;

public class Phonekemon {
   public int solution(int[] nums) {
        int answer = 0;
        
        ArrayList<Integer> pkm = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
           if (pkm.contains(nums[i]) == false) {
              pkm.add(nums[i]);
           }
        }
        int size = pkm.size();
        int length = nums.length;
        
        if (size < length/2) {
           answer = size;
        } else {
           answer = length/2;
        }
        
        return answer;
    }
   
   public static void main(String[] args) {
      Phonekemon pk = new Phonekemon();
      
      int[] aa = {3,4,2,5,4};
      int a = aa.length;
      
      System.out.println(a);
   }

}