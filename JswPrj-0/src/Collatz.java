class Collatz {
    public int solution(int num) {
        int answer = 0;
        long no = (long) num;
        
        
        if (no == 1){
            answer = 0;
            return answer;
        }
        while (true){
            if (no % 2 == 0){
                no = no/2;
            }
            else {
                no = 3*no + 1;
            }
            answer++;
            if (no == 1){
                break;
            } 
            if (answer == 500){
                    answer = -1;
                    break;
            }
        }
        return answer;
    }
}