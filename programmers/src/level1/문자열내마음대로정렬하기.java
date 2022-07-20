package level1;
import java.util.*;

public class 문자열내마음대로정렬하기 {
	class Solution {
	    public String[] solution(String[] strings, int n) {
	        String[] answer = new String[strings.length]; //strings 의 범위까지 정답소스 길이 정하기
	        
	        for(int i = 0; i < strings.length; i++){
	            answer[i] = strings[i].charAt(n) + strings[i]; 
	            // 비교할 정수 부분을 가져온 뒤 배열의 해당 인덱스 추가로 더해주기
	        }
	        
	        Arrays.sort(answer); //오름차순으로 정렬
	        
	        for(int i = 0; i <answer.length; i++){
	            answer[i] = answer[i].substring(1); 
	            //substring으로 1번째 인덱스 부터 가져오기 
	            //0번째는 비교하려고 가져온거기때문에 필요 없음
	        }
	        
	        return answer;
	    }
	}
}
