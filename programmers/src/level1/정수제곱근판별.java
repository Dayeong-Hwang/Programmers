package level1;

public class 정수제곱근판별 {
	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        long sqrt = (long)Math.sqrt(n);
	        
	        if(n == Math.pow(sqrt,2)) {
	        	answer =  (long)Math.pow(sqrt+1,2);
	        } else {
	        	answer =  -1;
	        }
	        
	        return answer;
	    }
	}
}

//pow : 거듭제곱을 계산해주는 함수
//Math.pow(숫자, 거듭제곱 횟수);



//sqrt : 제곱근을 구해주는 함수
//Math.sqrt(숫자);
 