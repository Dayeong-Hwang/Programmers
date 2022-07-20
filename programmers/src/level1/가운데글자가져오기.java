package level1;

public class 가운데글자가져오기 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        int length = s.length(); //문자열은 1부터 시작
	        
	        if(length % 2 == 0){
	            answer = s.substring((length/2)-1, (length/2)+1);
	        }else{
	            answer = s.substring((length/2),(length/2)+1);
	        }
	        
	        
	        return answer;
	    }
	}




	//substring(int start): start 위치부터 끝까지 문자열 반환
	//substring(int start, int end): start 위치부터 end 전까지 문자열 반환

}
