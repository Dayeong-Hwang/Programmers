package level1;

import java.util.Arrays;

public class 완주하지못한선수1 {
	class Solution {
	    public String solution(String[] participant, String[] completion) {

	        // Participant 배열과 Completion 배열을 순서대로 정렬         
	    	// 일치하지 않는 선수의 인덱스를 리턴


	        String answer = "";
	        Arrays.sort(participant);
	        Arrays.sort(completion);

	        int i = 0;
	        for(i = 0; i<completion.length; i++){
	            if(!participant[i].equals(completion[i])){
	                return participant[i];
	            }
	        }
	        answer = participant[i];
	        return answer;
	    }
	}

}
