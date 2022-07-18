package level1;

public class 핸드폰번호가리기 {
	class Solution {
	    public String solution(String phone_number) {
	        StringBuilder answer = new StringBuilder(phone_number);
	        
	        //String 의 특정 index의 문자열 교체
	        //setCharAt(index, c) -- index: 문자를 설정한 위치의 인덱스 /c: 주어진 위치에 저장할 문자
	        
	        for(int i =0; i<phone_number.length()-4; i++){
	            answer.setCharAt(i,'*');
	        }
	        
	        //배열	.length
	        //문자열	.length()
	        //ArrayList	.size()
	        
	        return answer.toString(); //StringBuilder는 문자열을 뽑아낼 때 .toString()을 사용
	    }
	}
}
//https://velog.io/@lee951109/Programmers-%ED%95%B8%EB%93%9C%ED%8F%B0-%EB%B2%88%ED%98%B8-%EA%B0%80%EB%A6%AC%EA%B8%B0-JAVA