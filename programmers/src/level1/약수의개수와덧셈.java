package level1;

public class 약수의개수와덧셈 {
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;
	        for(int i = left; i <= right; i++){ // 제곱수인 경우 약수의 개수가 홀수 , 없으면 짝수
		
	            if(i % Math.sqrt(i) == 0){
	                answer -= i;

	            }else { 
	                answer +=i;
	           }
	        }
	        return answer;
	    }
	}

}
