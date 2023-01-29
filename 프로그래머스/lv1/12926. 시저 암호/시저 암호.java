class Solution {
    public String solution(String s, int n) {
		String answer = "";
        
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            //1. 공백일 경우 : 공백 추가 후 continue
            if(ch==' '){
                answer += ch;
                continue;
            }
            //a~z일경우
            if(ch>='a' && ch<='z'){
                //ch+n을 했을때 a~z보다 클경우에 -26해줌
                if(ch+n>'z'){
                    answer +=(char) (ch+n-26);
                }else{
                    answer += (char) (ch+n);
                }
            }
            //A~Z일경우
            if(ch>='A' && ch<='Z'){
                //ch+n을 했을때 a~z보다 클경우에 -26해줌
                if(ch+n>'Z'){
                    answer +=(char) (ch+n-26);
                }else{
                    answer += (char) (ch+n);
                }
            }
        }
		return answer;
	}
}