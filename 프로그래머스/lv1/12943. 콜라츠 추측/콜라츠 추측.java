class Solution {
    //콜라츠 추축
    //모든 수를 1로 만들기
    public int solution(int num) {
        int answer = 0;
        long n = (long)num;// 숫자가 커질 경우를 대비하여 int를 long으로 바꾸어야한다.
        
        while(n>1){//이게 중요
            if(answer>=500){
                answer=-1;
                break;
            }
            //n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            //answer++;
            if(n%2==0){
                n = n/2;
                answer++;
            }else{
                n = n*3 + 1;
                answer++;
            }
        }
        return answer;
    }
        
        
}