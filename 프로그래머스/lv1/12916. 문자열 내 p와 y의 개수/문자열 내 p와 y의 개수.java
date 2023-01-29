class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] py = s.toCharArray();
        int cnt_p = 0;
        int cnt_y = 0;
        
        
        
        for(int i=0; i<py.length;i++){
            if(py[i]=='p' || py[i]=='P'){
                cnt_p++;
            }else if(py[i]=='y' || py[i]=='Y'){
                cnt_y++;
            }
        }
        
        
        if(cnt_p==cnt_y){ 
            answer = true;
        }else{
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}