import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = "";
        //Long to String & split
        String arr[] = Long.toString(n).split("");
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            str = str + arr[i];         
        }
        //String to Long
        answer = Long.parseLong(str);
        System.out.println(str); 
        return answer;
    }
}