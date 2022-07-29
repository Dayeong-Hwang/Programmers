package level1;

public class 내적 {
	class Solution {
	    public int solution(int[] a, int[] b) {
	        int answer = 0;
	        //길이만큼 반복하며 배열의 같은 인덱스 값끼리 곱하고 모두 더함
	        
	        for(int i =0; i<a.length; i++){
	            answer += (a[i]*b[i]);
	        }
	        return answer;
	    }
	}
}
