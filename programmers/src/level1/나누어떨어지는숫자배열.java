package level1;
import java.util.*;

public class 나누어떨어지는숫자배열 {
	class Solution {
	    public ArrayList<Integer> solution(int[] arr, int divisor) {
	        // 리턴 타입도 변경 ArrayList<Integer>
	        ArrayList<Integer> answer = new ArrayList<>();
	        
	        for(int i : arr){
	            if(i % divisor == 0){
	                answer.add(i);
	            }
	        }
	        
	        Collections.sort(answer); // ArrayList라서 Arrays.sort()가 아님.
	        
	        if(answer.size() == 0){ //ArrayList는 size로 판별
	            answer.add(-1);
	        }
	        
	        
	        
	        return answer;
	    }
	}

}
