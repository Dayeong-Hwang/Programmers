package level1;

public class 삼진법뒤집기 {
	class Solution {
	    public int solution(int n) {
	        int answer = 0;
	        
	       // Integer.parseInt(숫자,진법)
	       // Integer.parseInt(문자, 진법)
	      // 10진수 -> n진수, 혹은 n진수 -> 10진수 바꿀땐 진법에 n진수를 적어야함

	        //10진법을 3진법으로 바꾸는 방법 : 
	        //3으로 계속 나누어 몫이 0이 될 때 까지 반복하면 구할 수도 있지만 매서드 활용함
	        
	        // new StringBuilder(Integer.toString(n,3)).reverse()
	        // 3진법으로 변경 // 바꾼문자를 뒤집기


	        // new StringBuilder(Integer.toString(n,3)).reverse() 이걸 숫자로 바꿔서 10진법으로 만들면 되는데
	   

	       
	        //StringBuilder 값을 문자로 바꿔주기 위해서 .toString()함
	        answer =  Integer.parseInt(new StringBuilder(Integer.toString(n,3)).reverse().toString(), 3);
	        return answer;
	    }
	}
}
