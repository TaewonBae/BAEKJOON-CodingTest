class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean flag = false; // flag = true 소수가 아니다.
        for(int i = 0; i<nums.length-2;i++){
            for(int j = i+1; j<nums.length-1;j++){
                int sum = 0;
                for(int k = j+1; k<nums.length;k++){
                    flag = false;
                    sum = nums[i] + nums[j] + nums[k];
                    for(int a = 2; a<sum; a++){
                        if(sum%a==0){
                            flag = true; //나누어 떨어지면 소수가 아니다.
                            break;
                        }
                    }
                    if(flag==false){
                        answer++;
                    }
                }
            }
        }
        

        return answer;
    }
}