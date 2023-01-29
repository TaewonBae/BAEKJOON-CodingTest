class Solution {
    public long[] solution(int x, int n) {
        // n의 개수만큼 배열이 만들어지니까 n의 개수의 배열을 생성해준다.
        long[] answer = new long[n];
        // 제한조건에서 범위가 크므로 int가 아닌 long으로...
        // for 문을 돌려서 몇 개인지를 확인한 후에
        for(int i=0; i<answer.length; i++){
            answer[i] = (long)x * (i+1);
        }
        
        return answer;
    }
}