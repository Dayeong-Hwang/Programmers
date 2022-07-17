package level1;

public class 로또의최고순위와최저순위 {
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
	    //민우가 구매한 로또 번호를 담은 배열 lottos
	    //당첨 번호를 담은 배열 win_nums
	        
	        
	        int zero = 0;
	        int cnt = 0;
	        
	        for(int l:lottos){
	            if (l == 0) zero ++;
	            else {
	                for(int w:win_nums){
	                    if(l==w){
	                        cnt++;
	                        break;
	                    }
	                } 
	            }
	        }

	        int min = cnt; // 0을 제외하고 win_nums 요소와 맞는것 
	        int max = cnt + zero; // 알아볼 수 없는 번호가 모두 맞았을 경우 max의 최대 값이 당첨 개수
	        
	        int[] answer = {getResult(max),getResult(min)};
	        //당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 
	        return answer;
	    }
	    
	    public int getResult(int n){
	        switch(n){
	            case 6: 
	                return 1;
	            case 5: 
	                return 2;
	            case 4: 
	                return 3;
	            case 3: 
	                return 4;
	            case 2: 
	                return 5;
	            default:
	                return 6;
	        }
	    }
	     
	}

}
