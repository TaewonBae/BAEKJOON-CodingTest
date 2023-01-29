class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        while(n>0){ //몫은 결국 숫자로만 남게되니깐 0은없으니 이렇게하면됨.
            str = str+(n%3);
            n = n/3;
        }
        return Integer.parseInt(str, 3); //string을 3진법으로 표현
    }
}