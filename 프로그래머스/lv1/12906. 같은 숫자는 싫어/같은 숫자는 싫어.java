import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>(); //arraylist 선언
        
        for(int i = 0; i<arr.length;i++){
            if(i==0){
                list.add(arr[i]);
            }else{
                if(arr[i]!=arr[i-1]){
                    list.add(arr[i]);
                }
            }
        }
        
        answer = new int[list.size()];//배열 갯수 초기화
        
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}