class Solution {
    public int[] solution(long n) {
        String a = ""+n;
        int cnt = 0;
        int[] answer = new int[a.length()];
        while(n!=0){
            answer[cnt] = (int)(n%10);
            n = n/10;
                cnt++;
        }
        return answer;
    }
}