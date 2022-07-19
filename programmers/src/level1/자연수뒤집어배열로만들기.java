package level1;

public class 자연수뒤집어배열로만들기 {
	class Solution {
	    public int[] solution(long n) {
	    	String str = ""+n; //        //입력받은 문자열 길이만큼 배열 생성
	    	
	        int[] answer = new int[str.length()];
	        int cnt =0; //배열은 0부터 시작
	        
	        while(n!=0) {
	        	//1의자리 값을 배열에 순서대로 넣기
	        	answer[cnt] = (int)(n%10); //나눈 나머지를 배열에 넣고
	            n/=10;
	            //나누면 맨마지막 자리는 숫자는 없어짐
	            cnt++;
	        }
	        
	        //12345중 마지막숫자는 12345%10에서 구한 5, 
	        //(12345/10)을 하면 1234만 남으므로 그다음은 1234%10 = 4...
	        return answer;
	    }
	}
}
