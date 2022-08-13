package level1;

public class 최소직사각형 {
	class Solution {
	    public int solution(int[][] sizes) {
	        // 가로로 눕혀 수납한다면 => 가로, 세로 구분이 없다는 뜻
	        // 가로/세로 두값을 비교하여 한쪽에 제일 큰값을 넣고 다른 한쪽에는 제일 작은 값을 넣어서 재정리하기!
	        // 한쪽에도 제일 큰값넣고 다른한쪽에도 제일 큰값을 넣으면 이상하겠지????
	        
	        int w = 0;
	        int h = 0;
	        
	        for(int[] size : sizes){
	            w = Math.max(w, Math.max(size[0],size[1]));
	            h = Math.max(h, Math.min(size[0],size[1]));
	        }
	        
	        int answer = w * h;
	        return answer;
	    }
	}
}
