package level1;

public class 최대공약수와최소공배수 {
	class Solution {
	    public int[] solution(int n, int m) {

	        
	        int max = Math.max(n, m); // Math함수를 이용해서 입력받은 두 수 중 큰수를 max변수에 담아줌
	        int min = Math.min(n, m); // Math함수를 이용해서 입력받은 두 수 중 작은 수를 min변수에 담아줌
	        
	        
	        //최대 공약수 
	        while(min !=0) { //두 수중 더 작은 수로 두 수를 나눠주며 모두 나눠떨어질 때 최대공약수를 구함
	        	int r = max % min; // 큰수 / 작은수의 나머지  
	        	max = min; // 그 중 작은 수 (최대공약수 = 작은수)
	        	min = r; // 작은 수에는 나머지값
	        }
	        
	        
	        
	        // 최소 공배수 = 두수의 곱/ 최대공약수
	        int gcd = n * m / max;
	        
	        int[] answer = {max,gcd};
	        
	        return answer;
	    }
	}
}

//* 방법 *
//
//1. 입력받은 두 수 중 큰수를 결정
//2. 큰수를 작은 수로 나눈다
//3. 나머지가 0 일경우
//   최대공약수 = 작은수
//   최소공배수 = (두수의곱)/최대공약수
//4. 나머지가 0이 아닐경우
//     큰수   = 작은 수
//     작은수 = 나머지 로 정하고
//   2번부터 다시 반복