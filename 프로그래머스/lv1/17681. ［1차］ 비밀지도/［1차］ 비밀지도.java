import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] a1 = new int[n];
        
        //n->2진수 변환
        //Integer.toBinaryString()을통해 2진구하는데 or을 사용해서 두개를 한번에 구하기
        for(int i = 0; i<n; i++){
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]); //or로 2진구하기 맨앞자리가0이면 0표현안돼
        }
        for(int i = 0; i<n; i++){
            //%s 앞에 숫자(N)를 설정할 경우, str.length()가 N보다 작을 경우 공백을 추가합니다. (ln 4~5)
            answer[i] = String.format("%" + n + "s", answer[i]); //이것까지 같이해야 " 11011" 이렇게 나옴 "%6s"
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
           
        return answer;
    }
}