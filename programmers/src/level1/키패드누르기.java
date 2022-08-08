package level1;

public class 키패드누르기 {
	class Solution {
		Position left; // 왼손 관리
		Position right; // 오른손 관리
		Position numPos; // 숫자 관리
	    public String solution(int[] numbers, String hand) {
	        String answer = "";
	        
	        // 1.  왼손 오른손 위치 초기화
	        // 왼손은 * 
	        left = new Position(3, 0); 
	        // 오른손은 # 초기화
	        right = new Position(3, 2);
	        
	        for(int num : numbers) { 
	        	// 숫자 위치 계산식 (0,1) 이런식으로 생각해서 구하기
	        	// 		0	 1   	2
	        	//	0
	        	//	1
	        	//	2
	        	//	3
	        	numPos = new Position((num -1) /3, (num -1) % 3);
	        	if(num == 0) {
	        		numPos = new Position(3, 1);
	        	}
	        	
		        // 2. 숫자를 누를 손가락 정하기
	        	// 즉, 주손이 어떤 손인지 파라미터로 전달
	        	String finger = numPos.getFinger(hand);
	        	
	        	// 3. 정해진 손가락을 answer에 담고 손가락 위치 이동
	        	answer += finger;
	        	if(finger.equals("L")) {
	        		left = numPos;
	        	} else {
					right = numPos;
				}
	        }

	        return answer;
	    }
	    
	    class Position{
	    	int row;
	    	int col;
	    	
	    	public Position(int row, int col) {
	    		this.row = row;
	    		this.col = col;
	    	}
	    	
	    	public String getFinger(String hand) {
	    		//본인의 주손을 넣음
	    		String finger = hand.equals("right") ? "R" : "L";
	    		//0번째 열이라면 무조건 왼손을 써야함
	    		if(this.col == 0) {
	    			finger = "L";
	    		}
	    		else if (this.col == 2) { finger = "R";
	    		
	    		}else { //1번 열에 있을 경우 왼쪽 손가락과의 거리 ,오른쪽 손가락과의 거리를 구해야함
	    			int leftDist = left.getDistance(this); //numPos 객체
	    			int rigtDist = right .getDistance(this);
	    			
	    			if(leftDist < rigtDist) {
	    				// 왼손이 더 가까우면
	    				finger = "L";
	    			}else if (rigtDist < leftDist) {
	    				// 오른손이 더 가까우면
	    				finger ="R";
	    			}
	    		}
	    		return finger;
	    	} // getFinger매서드
	    	
	    	public int getDistance(Position p) {
	    		return Math.abs(this.row -p.row) + Math.abs(this.col -p.col);
	    	}
	    } // class Position
	}

}


// 풀이 참고 유튜브 : https://www.youtube.com/watch?v=jFv2LRVCK6s