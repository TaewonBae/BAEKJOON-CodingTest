import java.util.*;
//각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
class Solution {
    //첫 글자를 index의 요소, strings의 요소를 합친 값을 list로 저장합니다. 그리고 정렬
    //ex) 정렬 전 : asun , ebed, acar 정렬 후 : acar, asun, ebed
    //정렬 후에는 '인덱스 n의 문자가 같은 문자열이 여럿 일 경우'가 해결됩니다
    //answer 배열에 substring(1) 메소드를 사용하여 첫 글자를 제외한 문자를 저장합니다.
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);//ArrayList 정렬함수
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);//0을 제외한 index1부터 끝까지 저장
        }
        
        return answer;
    }
}