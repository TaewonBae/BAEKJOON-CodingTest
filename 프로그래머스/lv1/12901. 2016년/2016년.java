class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {0,31,29,31,30,31,30,31,31,30,31,30,31}; //0월,1월,...12월
        int select = 0;

        //a월까지 date수
        for(int i = 0; i < a; i++){
            select += date[i];
        }
        select += b - 1; //b-1을 하는 이유는 1월 1일이 하루가 지난날이 아니기 때문이다.

        return day[select % 7];
    }
}