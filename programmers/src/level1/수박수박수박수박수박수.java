package level1;

public class 수박수박수박수박수박수 {
	class Solution {
	    public String solution(int n) {
	        String answer = "";
	        
	        for(int i =0; i<n; i++){
	            answer += i % 2 == 0? '수':'박';
	        }
	        
	        // 1을 2로 나누면 짝수가 아니니까 i의 첫 시작은 0
	        // 처음에 수를 더해야 하므로 조건을 i%2!=0으로 해야 i =1 가능
	        
	        return answer;
	    }
	}
}
