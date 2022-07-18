package level1;
import java.util.*;

public class 정수내림차순으로배치하기 {

	class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        
	        String[] arr = String.valueOf(n).split("");
	        Arrays.sort(arr);
	        
	        StringBuilder sb = new StringBuilder();
	        for(String list : arr) { ////StringBuilder에 하나씩 넣는다.
	        	sb.append(list);
	        }
	        
	        return Long.parseLong(sb.reverse().toString());
	        //StringBuilder to String : toString();
	        //String to Long : Long.parseLong(str);
	    }
	}
	
}
