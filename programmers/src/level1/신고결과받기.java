package level1;

import java.util.*;

public class 신고결과받기 {

	 public int[] solution(String[] id_list, String[] report, int k) {
		 //HashMap,HashSet에 담으면 중복이 모두 제거됨(중복을 허용 안함)
		 //value는 중복이 되면 안됩니다!
		 HashMap<String, HashSet<String>> reportHash = new HashMap<String, HashSet<String>>();
		 HashMap<String, HashSet<String>> resultHash = new HashMap<String, HashSet<String>>();
		 
		 
		 for(String r : report) { //report의 원소는 "이용자id 신고한id"형태의 문자열이며 이용자id와 신고한id는 공백(스페이스)하나로 구분되어져 있음
			 String[] str = r.split(" "); // "muzi frodo"의 경우 str[0] "muzi"가 str[1]"frodo"를 신고했다는 의미
			 if(reportHash.containsKey(str[0]) == false) { //키가 있는지 확인하는 작업, 처음에는 없기때문에 false
				 reportHash.put(str[0], new HashSet<String>()); //str[0] 넣고 new HashSet<String>() 생성만 하기때문에 아직 해시셋은 비어있음
			 }
			 reportHash.get(str[0]).add(str[1]); //get(str[0])의 값을 꺼내와서 new HashSet<String>() 값이 나올테니까 여기서 HashSet가져와서 add(str[1])함
			 
			 // 신고한 유저 str[0]가 불량유저 str[1]를 신고한 것을 넣어줌
			 
			 if(resultHash.containsKey(str[1]) == false) {
				 resultHash.put(str[1],  new HashSet<String>());
			 }
			 resultHash.get(str[1]).add(str[0]); 
			 //불량유저 str[1]가  유저 str[0]한테 신고를 당했음
		 }
		 
		 
		 
	        int[] answer = new int[id_list.length]; //유저개수만큼 생성
	        
	        for(int i = 0; i < answer.length; i++) { //메일받는 거 확인
	        	String user = id_list[i];
	        	if(reportHash.containsKey(user) == false) continue; //신고한적이 없을수도 있으니
	        	
	        	for(String bad : reportHash.get(user)) { //user가 신고한 불량유저가 나옴
	        		if(resultHash.get(bad).size() >=k) {
	        			answer[i] ++; //메일받음
	        		}
	        	}
	        }
	        return answer;
	    }
}


//HashMap vs HashSet:https://siahn95.tistory.com/entry/Java%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-HashMap-HashSet-%EC%9D%B4%EB%9E%80-5-HashMap-vs-HashSet
//HashMap은 중복 Key 값을 허용하지 않지만, 중복 Value 값은 허용한다.
//ex. {'a': 1, 'b': 1, 'c': 2}
//
//HashSet은 객체 자체를 데이터로 저장하기 때문에 중복을 허용하지 않는다.
//ex. {'a', 'b', 'c'}
//풀이 참고 유튜브 : https://www.youtube.com/watch?v=w-zHRKAXeK0