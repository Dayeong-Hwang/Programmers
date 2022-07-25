package level1;

public class 없는숫자더하기 {
	class Solution {
	    public int solution(int[] numbers) {
	        int answer = -1;
	        
	        int sum = 45 ; //숫자들의 합 (0~9)
	        
	        for(int number : numbers){
	            sum -= number;
	        }
	        
	        answer = sum;
	        return answer;
	    }
	}
}
