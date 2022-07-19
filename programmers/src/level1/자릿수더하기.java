package level1;

import java.util.*;

public class 자릿수더하기 {
	public class Solution {
	    public int solution(int n) {
	        int answer = 0;

	    String[] num = String.valueOf(n).split("");
	    

	    for(String anNum : num){

	      answer += Integer.parseInt(anNum);
	        
	    }
	        return answer;
	    }
	}
}
