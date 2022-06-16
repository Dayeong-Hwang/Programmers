package level2;
import java.util.*;

class Solution {
     public String[] solution(String[] record) {
    	
    	List<String> ansList = new ArrayList<String>();
    	
        //아이디를 key, 닉네임을 value
    	Map<String,String> idMap =new HashMap<String,String>();
    	
    	//익명으로 주어진 record를 for문으로 순회하면서 idMap 값 채우기
    	for(String str : record) {
    		StringTokenizer stringTokenizer = new StringTokenizer(str);
    		String firstStr = stringTokenizer.nextToken();
    		
            //아이디가 바뀔 수 있는 경우 _중복된 key가 들어갈때는 이전 키,값을 지금의 것으로 업데이트
    		if(firstStr.equals("Enter") || firstStr.equals("Change") ) {

    			//second
    			String secondId = stringTokenizer.nextToken();
    			//third
    			String thirdNicName = stringTokenizer.nextToken();
    			idMap.put(secondId,thirdNicName);
    		}
    	}
    	

    	for(String str : record) {
    		StringTokenizer tokenizer = new StringTokenizer(str);
    		String firstStr = tokenizer.nextToken();
    		
    		if(firstStr.equals("Enter")) {
                String secondId=tokenizer.nextToken();
                //secondId 키에 해당하는 값 가져오기
    			ansList.add(idMap.get(secondId) + "님이 들어왔습니다.");
    		} else if (firstStr.equals("Leave")) {
                String secondId=tokenizer.nextToken();
    			ansList.add(idMap.get(secondId) + "님이 나갔습니다.");
			}
    	}
    	
        String[] answer = new String[ansList.size()];
        ansList.toArray(answer);
        
        return answer;
	}
}

//풀이 참고 유튜브 : https://www.youtube.com/watch?v=TFMDF-BVOAs