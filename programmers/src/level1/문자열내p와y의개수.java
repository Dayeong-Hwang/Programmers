package level1;

public class 문자열내p와y의개수 {
	class Solution {
	    boolean solution(String s) {
	        boolean answer = true;
	        int pCnt= 0;
	        int yCnt =0;
	        
	        for(char c : s.toCharArray()){
	            if(c == 'p' || c == 'P') pCnt++;
	            else if(c == 'y' || c == 'Y') yCnt++;
	        }
	    
	        return answer =pCnt == yCnt ? true : false;
	    }
	}
}
