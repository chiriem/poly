import java.util.*;

public class three_jin {

   public int solution(int n) {
      int answer = 0;
      int m = n;
      int count = 1;
      while (m > 2) {
         m = m/3; 
         count++;
      }
      int [] thr = new int [count];
      m = n;
      for (int i = 0; i < count; i++) {
         thr[i] = m % 3;
         m = m/3;
      }
      int [] ten = new int [count];
      int cal = 1;
      for (int i = 0; i < count; i++) {
         for (int j = 0; j < count - 1 -i; j++) {
            cal = 3*cal;
         }
         ten[i] = thr[i]*cal;
         cal = 1;
      }
     
      for (int i = 0; i < count; i++) {
         answer += ten[i];
      }
      return answer;
   }
   public static void main(String[] args) {
      three_jin tj = new three_jin();
      Scanner sc = new Scanner(System.in);
      
      int in = sc.nextInt();
      
      int ou = tj.solution(in);
      
      System.out.println(ou);
   }
}