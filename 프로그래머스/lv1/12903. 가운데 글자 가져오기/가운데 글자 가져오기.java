import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int a = s.length();
        if(a%2==0){
            answer = s.substring((a/2)-1,(a/2)+1); 
            System.out.println(a);
        }else{
            answer = s.substring(a/2,(a/2)+1); 
                        System.out.println(a);
        }
       
        return answer;
    }
}