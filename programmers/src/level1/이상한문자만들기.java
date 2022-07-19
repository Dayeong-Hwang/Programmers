package level1;

public class 이상한문자만들기 {
	class Solution {
	    public String solution(String s) {
	        String answer = "";
	        
	        int idx = 0;
	        String[] arr = s.split("");
	        
	        // 단어 단위로 짝/홀수를 판단해야 하기 때문에 
	        // 반복문을 돌다가 공백을 만나면 cnt값을 0으로 초기화
	        // 공백 이후 자리수가 0으로 돌아가기 때문에 공백 확인
	        //공백을 만났으니 다시 새로운 단어 시작이므로 index를 0으로 설정
	        
	        for(String str : arr) {
	        	idx = str.contains(" ") ? 0 : idx +1;
	        	answer += idx % 2 ==0? str.toLowerCase() : str.toUpperCase();
	        }
	        return answer;
	    }
	}
}
