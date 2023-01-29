class Solution {
    public int solution(int[] number) {//정수번호 3개를 더하면 0 >> 삼총사
        int answer = 0;
        //첫번째는 length-2까지, 두번째는 length-1까지, 마지막은 length까지
        for(int i = 0; i<number.length-2;i++){
            for(int j = i+1; j<number.length-1;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                    
                }
            }
            
        }
        return answer;
    }
}