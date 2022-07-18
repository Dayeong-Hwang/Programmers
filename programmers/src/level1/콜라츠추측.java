package level1;

public class 콜라츠추측 {
	class Solution {
	    public int solution(long num) {
	        int answer = 0;
	        
	        //모든 수를 1로 만들 수 있다는 추측
	    
	       while( num!=1){
	           num = (num % 2 == 0) ? num/2 : num * 3+1;
	           answer ++;
	       }
	        return answer >=500? -1 : answer;
	    }
	}

	//홀수 -> 짝수 -> 홀수 -> 짝수 형태를 계속 반복하다보면 
	//num이 int 형이기때문에 오버플로우 발생.
	//-> num을 long으로 변경하거나, long I = (long) num; 이런식으로 형변환을 해주면 됨
}
