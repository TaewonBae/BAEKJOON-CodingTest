import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(int i=0; i<commands.length;i++){
            a = commands[i][0];
            b = commands[i][1];
            c = commands[i][2];
            int[] arr = Arrays.copyOfRange(array, a-1, b); //(a-1 ~ b까지 자름)
            Arrays.sort(arr);
            answer[i] = arr[c-1];
            // System.out.println(Arrays.toString(arr));
            
        }

        
        return answer;
    }
}