package level1;

public class 하샤드수 {
	class Solution {
	    public boolean solution(int x) {
	        boolean answer = true;
	        //String.valueOf() 메서드 - 지정 값을 문자열로 변환.
	        String str = String.valueOf(x);
	        String[] numArr = str.split("");
	        
	        int sum = 0;
	        
	        for(String num : numArr){
	            sum += Integer.parseInt(num); //문자열을 숫자로 변환시킴
	        }
	        
	        return (x % sum == 0? true : false);
	    }
	}
}
