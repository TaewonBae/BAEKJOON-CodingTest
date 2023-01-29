import java.util.*;
// 1. Math함수를 이용해서 입력받은 두 수 중 큰 수를 max 변수에 담아준다.
// 2. Math함수를 이용해서 입력받은 두 수 중 작은수를 min 변수에 담아준다.
// 3. 최대공약수를 구하는 반복문을 작성(유클리드 호제법 이용)

//유클리드 호제법 : 두 수의 최대공약수를 구하는 알고리즘
// 2개의 자연수 a,b에 대해 a를b로 나눈 나머지를 r이라 하면(단, a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
class Solution {
    public int[] solution(int n, int m) {
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        //최대공약수
        while(min!=0){
            int r = max%min;
            max = min;
            min = r;
        }
        
        //최소 공배수 = 두수의 곱 / 최대공약수
        int gcd = n * m / max;
        
        int[] answer = {max, gcd};
        return answer;
    }
}