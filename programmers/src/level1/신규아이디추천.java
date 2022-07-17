package level1;
import java.util.*;

public class 신규아이디추천 {
	class Solution {

	    boolean isValid(char c) {
	    	//2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
	    	if(Character.isLetterOrDigit(c)) return true; //문자인지 확인하는 매서드
	    	if(c =='-' || c == '_'|| c=='.') return true; //
	    	
	    	return false;
	    	
	    } // 문자가 유효한지 아닌지 확인하기 위한 매서드
	    
	    
	    public String solution(String new_id) {
	        StringBuilder answer = new StringBuilder(); 

	        boolean lastDot = false; //마침표확인
	       
	        for(char ch : new_id.toCharArray()){
	               if(isValid(ch) == false) continue; 

	               if(ch == '.') {
	            	   if(answer.length() == 0 || lastDot) continue;
	            	   lastDot = true;
	               } else {
	            	   lastDot = false;
	               }
	               
	               //1단계
	               ch = Character.toLowerCase(ch); //toUpperCase()
	               answer.append(ch);
              
	}

	          
	          if(answer.length() >= 16)
	        	  answer.setLength(15);
	          
	          if(answer.length()==0)
	        	  answer.append('a');
	          
	          if(answer.charAt(answer.length() -1 ) == '.')
	        	  answer.deleteCharAt(answer.length() - 1);
	          
	          if(answer.length() <= 2) {
	        	  char ch = answer.charAt(answer.length() -1 );
	        	  while(answer.length() < 3) {
	        		  answer.append(ch);
	        	  }
	          }
	          
	        return answer.toString();
	    }
	}
}


//참고 유튜브 : https://www.youtube.com/watch?v=QgiUy-N_j3s