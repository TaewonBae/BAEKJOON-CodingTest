class Solution {
    //원래 이용료 : price, 현재 금액 : money, 놀이기구 이용횟수 : count
    public long solution(int price, int money, int count) {
        long sum = 0;
        long answer = 0;
        for(int i = 1; i<=count; i++){
            sum += price*i;
        }
        if(sum > money){
            answer = sum - money;
        }else{
            return 0;
        }
        return answer;
    }
}