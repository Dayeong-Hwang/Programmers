package level1;

import java.util.Calendar;

public class 이천십육년2016 {

class Solution {
    public String solution(int a, int b) {
	        String answer = "";
	        
	        Calendar cal = Calendar.getInstance();
	        //Calender클래스의 월은 1~12월 -> 0~11월로 표현
	        //즉, 0월 = 1월
	        
	        cal.set(2016,a-1,b);
	        int dayNum = cal.get(Calendar.DAY_OF_WEEK);
	        //Calender클래스의 요일은 1부터 시작
	        //즉 1 = 일요일
	        
	        switch(dayNum){
	            case 1 : answer ="SUN";
	            break;
	            case 2: answer ="MON";
	            break;                
	            case 3: answer ="TUE";
	            break;
	            case 4: answer ="WED";
	            break;    
	            case 5: answer ="THU";
	            break;
	            case 6: answer ="FRI";
	            break;                
	            case 7: answer ="SAT";
	            break;                
	        }
	
	        return answer;
	    }
	}
}
