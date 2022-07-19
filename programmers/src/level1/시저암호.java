package level1;

public class 시저암호 {
	class Solution {
	    public String solution(String s, int n) {
	        String answer = "";
	        // 26으로 나눠준 몫을 구하는 이유는, 소문자는 총 26개로 이루어져 있음
	        // 해당 소문자 값에 추가할 값 n을 더해주고 다시 a값을 빼준 후, 26으로 나누어줌
	        // n값에 z를 추가하게 된다면 아스키코드의 a~z값에서 벗어나게 되기때문
	     
	        
	        for(int i =0; i<s.length(); i++) { //입력받은 문자열 길이만큼 for문을 통해 반복
	        	char ch = s.charAt(i); //ch변수에 .charAt()메서드를 이용해 한문자씩 담음
	        	
	        	if(ch == ' ') {
	        		answer += ch;
	        		continue; //ch가 공백이라면 answer값에 더해주고 continue로 반복문을 다시 돌림
	        	}
	        	
	        	// .isLowerCase()메서드는 입력받은 인자가 소문자일때 true을 반환
	        	// .isUpperCase()메서드는 대문자일 때 true를 반환
	        	if(Character.isLowerCase(ch)) {
	        		answer += (char) ((ch - 'a' +n) % 26 + 'a');
	        	} else if(Character.isUpperCase(ch)) {
	        		answer += (char) ((ch -'A' + n)  % 26 +'A');
	        	}
	        }
	        
	        return answer;
	    }
	}
}
// 참고 블로그 : https://leylaoriduck.tistory.com/34