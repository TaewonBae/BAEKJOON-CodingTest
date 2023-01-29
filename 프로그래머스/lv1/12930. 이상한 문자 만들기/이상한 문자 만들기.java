import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        int idx=0;
        for(int i=0;i<arr.length;i++){
            //제한사항 : " " 공백을 만나면 index를 0으로 처리해야됨.
            if((" ").equals(arr[i])){
                idx = 0;
            }else{
                if(idx%2==0){
                    arr[i] = arr[i].toUpperCase();
                    idx++;
                }else{
                    arr[i] = arr[i].toLowerCase();
                    idx++;
                }
            }
            
          answer += arr[i];
        }
      
        return answer;
    }
}