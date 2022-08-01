package level1;

public class 숫자문자열과영단어 {
	class Solution {
	    public int solution(String s) {
	        int answer = 0;
	        
	        //String.replace([찾을 문자열], [변경 문자열]);

	        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
	        String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

	        //범위는 10으로 지정되어 있으니 0~9까지
	        for(int i = 0; i< 10; i++){
	          s= s.replace(word[i],num[i]);	
	        }
	        return Integer.parseInt(s);
	    }
	}
}
