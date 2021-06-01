class subak {
    public String solution(int n) {
        String answer = "";
        
        for (int i = 0; i < n/2; i++ ){
            answer = answer + "¼ö¹Ú";
        }
        if (n % 2 == 1){
            answer = answer + "¼ö";
        }
        
        return answer;
    }
}