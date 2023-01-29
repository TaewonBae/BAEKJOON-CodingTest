import java.util.*;
class Solution {
    public boolean solution(String s) {
        if(s.length()==4 || s.length()==6){
            try{
                int toNum = Integer.valueOf(s); // string to integer
                return true;
            }catch (Exception e){
                return false;
            }
        }else{
                return false;   
        }       
    }
}