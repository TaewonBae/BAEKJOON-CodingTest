class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split(""); //일단 split으로 string 배열로 나누자.
        
        for(int i=0;i<num.length;i++){
            if(i<num.length-4){
                answer = answer + "*";
            }else{
                answer = answer + num[i];
            }
        }
        return answer;
    }
}