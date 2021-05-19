import java.util.Scanner;

public class Divisor_sum {
   public int solution(int n) {
      int answer = 0;
      int i = 1;
      while (i <= n) {
         if (n % i == 0) {
            answer += i;
         }
         i++;
      }
      return answer;
   }
   

   public static void main(String[] args) {
      Divisor_sum dv = new Divisor_sum();
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int b = dv.solution(a);
      
      System.out.println(b);
   }

}