package level1;

public class 소수만들기 {
	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        int total =0;
	        
	        for(int i = 0; i<nums.length; i++){
	            for(int j = i+1; j<nums.length; j++){
	                for(int k= j+1; k<nums.length; k++){
	                    
	                    total = nums[i]+nums[j]+nums[k];
	                    
	                    //소수판별
	                    if(isSosu(total)){
	                        answer++;
	                    }
	                }
	            }
	        }

	        return answer;
	    }

	public boolean isSosu(int total){
	        //1은 소수가 아니므로
	        for(int i = 2; i<total; i++){
	            // 나누어 떨어지면 소수가 아니므로
	            if(total % i ==0){
	                return false;
	            }
	        }
	     return true; //나누어 떨어지지 않으면
	    }

	 }
}
