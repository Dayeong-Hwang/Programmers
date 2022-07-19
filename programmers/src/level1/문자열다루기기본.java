package level1;

public class 문자열다루기기본 {
	class Solution {
	    public boolean solution(String s) {
	        boolean answer = true;
	        
	        if(s.length() == 4 || s.length()==6) {
	        	for(int i = 0; i < s.length(); i++) {// 문자열에 숫자가 아닐경우 => false
	        		if(!Character.isDigit(s.charAt(i)))
	        			answer = false;
	        	}
	        } else {
	        	 answer = false;
	        }
	        
	        return answer;
	    }
	}
}
