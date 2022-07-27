package level1;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수2_HashMap {
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	         String answer = "";
	        
	        //Map - getOrDefault(key, default value)
	        //key에 해당하는 값이 있다면 찾는 키의 값을 반환하고 없다면 default value로 설정한 값으로 반환
	        //getOrDefault(key,0) : 찾는 키값이 존재하면 key값을 넣고 아니면 0을 넣음
	        
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        
	        //참가자
	        for(String str:participant){
	            map.put(str,(map.getOrDefault(str,0))+1);
	        }
	        
	        
	        //완주
	        for(String str:completion){
	            map.put(str,map.get(str)-1); //map 안의 값 가져오기
	            if(map.get(str) == 0){
	                map.remove(str);
	            }
	        }
	        
	        
	        //완주하지 못한 선수
	        for(String str:map.keySet()) {//keySet() - Map의 전체 key를 꺼냅
	            answer = str;
	        }
	        
	        return answer; 
	       
	    }
	}
}
