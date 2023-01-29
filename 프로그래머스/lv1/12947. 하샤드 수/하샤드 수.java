class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x2 = x;
        int temp=0;
        int sum=0;
        if(x>0 || x<10000){
            while(x!=0){
                temp=x%10;
                sum = sum + temp;
                x = x/10;
                }
        }        
        
        if(x2%sum==0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}