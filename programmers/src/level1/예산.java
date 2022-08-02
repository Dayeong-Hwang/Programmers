package level1;

import java.util.Arrays;

public class 예산 {
	class Solution {
	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        // 오름차순 : 금액이 작은 순서부터 비교해주면 더 많은 부서에 지원 가능
	        Arrays.sort(d);

	        for(int i = 0; i <d.length; i++){
	          if(d[i] <= budget){ 
	            budget -= d[i];

	            answer++; //예산에서 차감 후 1 증가
	        } else { 
	            break; // budget보다 커지면 break
	        }
	     }

	        return answer;
	    }
	}
}
