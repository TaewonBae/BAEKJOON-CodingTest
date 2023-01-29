class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int ab=0;
        for(int i = 0; i<a.length;i++){
            ab = a[i] * b[i];
            answer += ab;
        }
        return answer;
    }
}