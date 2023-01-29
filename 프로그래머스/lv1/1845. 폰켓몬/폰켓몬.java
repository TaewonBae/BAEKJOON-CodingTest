import java.util.*;
class Solution {// n마리중 n/2 가져가도됨, 같은 종류의 폰켓몬은 같은 번호
    public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length/2;
        
        //arraylist의 contains함수는 true or false를 나타내니 포함되지 않았으면(==false 일 경우) add로 추가해준다.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<nums.length ; i++){
            if(list.contains(nums[i])==false){
                list.add(nums[i]);
            }
        }
        if(list.size()>=pick){
            answer = pick;
        }else{
            answer = list.size();
        }
        return answer;
    }
}