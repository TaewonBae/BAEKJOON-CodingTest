import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        //ArrayList 초기화
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<numbers.length;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                int add_result = numbers[i] + numbers[j];
                //중복체크 ArrayList의 contains함수 이용
                if(list.contains(add_result)){
                     continue;
                }
                else {
                    list.add(add_result);
                }
            }
        }
        
        answer = new int[list.size()];
        for (int i=0;i<list.size();i++) {
            answer[i] = list.get(i);
        }
        //array sort함수 이용
        Arrays.sort(answer);  
        
        return answer;
    }
}