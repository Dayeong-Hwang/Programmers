package level1;

public class 부족한금액계산하기 {
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = 0; //금액이 부족하지 않으면 0을 return
	        long total = 0;

	        for(int i = 1; i <= count; i++){
	            total += price * i;
	        }
	        
	        // 돈이 부족한 경우
	        answer = total > money ?  total- money : 0;
	        return answer;
	    }
	}
}
