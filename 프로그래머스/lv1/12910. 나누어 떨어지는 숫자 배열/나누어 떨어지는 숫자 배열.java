import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> a1 = new ArrayList<Integer>(); //arraylist 사용
        
        //나눠 떨어질 경우
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                a1.add(arr[i]); //arraylist에 add로 값 추가
            }
        }
        //나눠 떨어지지 않을 경우
        if(a1.isEmpty()) {
              a1.add(-1); //arraylist에 -1추가
        }

        answer = new int[a1.size()]; //arraylist의 size()함수로 사이즈 측정해서 answer 선언
        for(int i=0; i<a1.size();i++){
            answer[i] = a1.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}