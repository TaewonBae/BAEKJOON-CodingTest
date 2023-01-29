class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        //가로에 작은수가 앞에 오도록
        for(int i=0; i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0]= sizes[i][1];
                sizes[i][1]= temp;
            }
            //가로 세로 max값 구해서 곱하기!
            row = Math.max(row, sizes[i][0]);
            col = Math.max(col, sizes[i][1]);
        }
        return row*col;
    }
}