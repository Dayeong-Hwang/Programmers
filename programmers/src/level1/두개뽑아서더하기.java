package level1;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {
	class Solution {
	    public int[] solution(int[] numbers) {
	        int[] answer = {};
	        
	        ArrayList<Integer> arrList = new ArrayList<Integer>();
	        for(int i =0; i<numbers.length; i++){
	            for(int j = i+1; j<numbers.length; j++){ //서로 다른 인덱스
	                if(!arrList.contains(numbers[i]+numbers[j])){
	                    arrList.add(numbers[i]+numbers[j]);
	                } // 중복값 제거 하고 리스트에 추가
	            }
	        }
	        
	        // 오름차순으로 정렬 ArrayList니까 Collections으로 정렬
	        Collections.sort(arrList);
	        
	        int cnt = 0;
	        answer = new int[arrList.size()];
	        for(int arr : arrList){
	            answer[cnt++] = arr; 
	        }
	        
	        return answer;
	    }
	}

}
