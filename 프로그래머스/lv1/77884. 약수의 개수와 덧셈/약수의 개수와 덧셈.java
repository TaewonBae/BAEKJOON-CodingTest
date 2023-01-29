class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        //left ~ right
        for(int j = left;j<=right;j++){
            int cnt = 0;
            //약수의 갯수 구하기
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    cnt++;
                }
            }
            answer = (cnt%2==0)?answer+j:answer-j;
        } 
        return answer;
    }
}