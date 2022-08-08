package level1;

import java.util.Arrays;
import java.util.List;

public class 키패드누르기2 {
	class Solution {
	    public String solution(int[] numbers, String hand) {
	        String answer = "";
	        
	        //  Arrays.asList를 이용하면 고정된 사이즈의 리스트로 반환
	        List<Integer> leftPushList = Arrays.asList(1,4,7); 
	        List<Integer> rightPushList = Arrays.asList(3,6,9); 
	        List<Integer> anyPushList = Arrays.asList(2,5,8,0);
	        
	    	StringBuilder builder = new StringBuilder();
	        
	    	// * : 10로 설정하여 풀기
	    	// # : 12로 설정하여 풀기
	    	int nowLeftFinger =  10;  //  * 초기화
	    	int nowRightFinger = 12; //   # 초기화
	        
	    	
	    	//순서대로 누를 번호가 담긴 배열 numbers
	    	for(int num : numbers) {
	    		if(leftPushList.contains(num)) {
	    			builder.append("L");
	    			nowLeftFinger = num;
	    		}
	    		if(rightPushList.contains(num)) {
	    			builder.append("R");
	    			nowRightFinger = num;
	    		}
	    		if(anyPushList.contains(num)) {
	    			// 맨 밑 줄 행은 
	    			// *, 0, # 이라서
	    			// 10, 11, 12 생각하고 품
	    			if(num == 0) {
	    				num = 11;
	    			}
    			
			    		// 거리 구하기 (행으로 이동 + 칸으로 이동)
			    			
			    		// 행은 +3 혹은 -3은 한칸씩 증감
		    			int leftTemp = Math.abs(nowLeftFinger - num); //3번 -> 9번 이동시에는 음수가 되는데 절대값으로 음수 양수 구분을 없애기
		    			int rightTemp = Math.abs(nowRightFinger - num);
		    			//  nowLeftFinger 이 9이고 누른 숫자가 3이면 9 - 3 =6이고 6을 3으로 나누면 2가 나온다. 즉 2칸 이동 
		    			
		    			
		    			int distanceByLeftFinger = leftTemp / 3 + leftTemp % 3;
		    			// 열은 나머지로 구하기
		    			// 같은 행 숫자의 차이는 +3 / -3 이므로 3으로 나누면 나머지는 항상 0이 됨
		    			// 1번 이동하면 나머지는 1, 두번 이동하면 나머지는 2가 됨
		    			int distanceByRightFinger = rightTemp / 3 + rightTemp % 3;
		    			
		    			if(distanceByLeftFinger > distanceByRightFinger) {
		    				nowRightFinger = num;
		    				builder.append("R");
		    			} else if (distanceByLeftFinger < distanceByRightFinger) {
		    				nowLeftFinger = num;
		    				builder.append("L");
		    			} else { //만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용   				
		    				if(hand.equals("left")) {
		        				nowLeftFinger = num;
		        				builder.append("L");
		    				} else {
		        				nowRightFinger = num;
		        				builder.append("R");    					
		    				}
		    			}
		    			
	    	  } // anyPushList.contains(num) if문 안이에요
	    		
	    	}		
	    	answer = builder.toString();
	        return answer;
	    }
	}
}
//풀이 참고 블로그 : https://jjjayyy.tistory.com/m/100