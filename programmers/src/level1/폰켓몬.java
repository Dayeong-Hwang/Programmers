package level1;

import java.util.HashSet;

public class 폰켓몬 {
	class Solution {
	    public int solution(int[] nums) {
	        int answer = 0;
	        
	        int choice= nums.length/2;

	        // 최대한 다양한 종류이면 중복이 최대한 적어야 하니까 
	        // 중복이 들어오면 알아서 제거해주는 HashSet을 사용

	        HashSet<Integer> hashSet = new HashSet<Integer>();

	        for(int n : nums) {
	            hashSet.add(n);
	        }

	        if(hashSet.size() < choice) { // 포켓몬의 종류(hashSet.size())가 choice보다 작으면 hashSet.size() 반환
	            answer = hashSet.size();

	        } else {
	            //종류의 개수 이기 때문에 set의 size()를 반환해도 되지만 nums.length/2 만큼
	            //선택해야 하기 때문에 set의 size()가 nums.length/2 크면 nums.length/2 값을 반환해야함
	            answer = choice;
	        }


	        return answer;
	    }
	}

}
