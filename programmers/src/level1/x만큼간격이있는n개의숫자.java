package level1;

public class x만큼간격이있는n개의숫자 {
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n]; // 입력받은 n의 개수만큼 배열의 크기 설정
	        
	        for(int i =0; i <answer.length; i++){ //배열의 자릿수만큼 반복
	            // length 뒤에 () 없어야함
	            answer[i] = (long)(i+1)*x;
	        }
	        // 0번 인덱스부터 x만틈 증가하여 출력
	        //x는 -10000000 이상, 10000000 이하인 정수 이기때문에 형변환을 하지 않으면 범위에서 벗어나게 됨
	        //n이 1000 이면 최대출력값이 10,000,000,000가 됨
	        return answer;
	    }
	}

}
//참고 블로그 : https://s-bug.tistory.com/58