class Count_sosu {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 2; i <= n; i++){
            boolean sosu = true;
            for (int j = 2; j<=Math.sqrt(i); j++){
                if (i%j == 0){
                    sosu = false;
                    break;
                }
            }
            if (sosu == true){
                answer++;
            }
        }
        if (n == 2){
            answer = 1;
        }else if (n == 3 || n == 4){
            answer = 2;
        }
        
        return answer;
    } 
}