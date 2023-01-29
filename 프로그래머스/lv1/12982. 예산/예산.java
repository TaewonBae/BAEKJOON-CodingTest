import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        //부서별로 신청한 금액 배열 d / 예산 budget
        int answer = 0;
        //1. sort
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++){
            if(d[i]<=budget){
                budget -= d[i];
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}