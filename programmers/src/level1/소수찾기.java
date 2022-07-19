package level1;

public class 소수찾기 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        // 어떤 숫자가 소수인지 확인할때 그 숫자를 2부터 해당 숫자의 제곱근범위까지로만 살펴보면 됨
	        // 에라토스테네스의 체
	        
	        
	        /*     
	         * 소수 → false, 비소수 → true가 된다.
	         * n+1로 길이를 설정하는 이유 :
	         * i가 n까지 포함되어 checked[n]으로 들어가는데,
	         * 배열의 index는 length보다 1작기 때문이다.
	         */  
	        
	        boolean[] checked = new boolean[n +1];
	        // 구하고자 하는 숫자까지 숫자 2부터 반복문을 실행한다. (1은 소수가 아님)
	        for (int i =2; i<=n; i++) {
	        	if(!checked[i]) {
	        		answer ++;
	        	}
	        	// 첫번째) j += i를 통해 2의 배수들을 true로 바꾼다.
	        	// 두번째) j += i를 통해 3의 배수들을 true로 바꾼다.
	        	// 세번째) j += i를 통해 4의 배수들을 true로 바꾸지만, 이미 2의 배수로 true로
	        	for (int j = i; j <=n; j +=i) {
	        		if(!checked[j]) {
	        			checked[j] = true;
	        		}
	        	}
	        }
	        
	        return answer;
	    }
	}
}


// 참고 블로그 : https://retrieverj.tistory.com/59