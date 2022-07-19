package level1;

public class 약수의합 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	        //1부터 n/2까지 순회하며 약수를 찾기(모든 약수는 숫자의 절반 이하)
	        // n % i 가 0이라면 n의 약수 (n/2 까지만 하면 n을 제외한 모든 약수를 찾을 수 있음)
	        //
	        
	         for (int i = 1; i <=n/2; i++) {
	        	 if(n%i == 0) answer += i;
	         }
	        return answer + n;  // 자기 자신도 약수이므로
	    }
	}

}
