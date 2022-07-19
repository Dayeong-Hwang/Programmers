package level1;

import java.util.*;
public class 문자열내림차순으로배치하기 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        char[] cArr = s.toCharArray();
	        Arrays.sort(cArr); //오름차순 (원래는 소문자가  먼저 옴)
	        
	        StringBuilder sb = new StringBuilder(String.valueOf(cArr)); //String 문자열 표현으로 바꿔 반환
	        answer =sb.reverse().toString(); 
	        return answer;
	    }
	}
}
