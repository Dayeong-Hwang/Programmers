package level1;

import java.util.HashSet;

public class 체육복 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        /*
	         * 1. Set 생성한다. 중복 제거
	         * 2. Reserved에서 하나씩 꺼내서, Lost set에 줄 수 있는 사람을 찾아서 준다.
	         * 3. 전체 n에서 Lost set의 인원을 빼서 체육복을 갖고 있는 사람의 수를 반환 한다.
	         */
	        
	        
	        // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve을 담을 resSet
	        HashSet<Integer> resSet = new HashSet<Integer>();
	        
	        //  체육복을 도난당한 학생들의 번호가 담긴 배열 lost을 담을 lostSet
	        HashSet<Integer> lostSet = new HashSet<Integer>();
	        
	        
	        for(int i : reserve) { // int[] reserve로 받은 값을 set에 저장한다.
	        	resSet.add(i);
	        }
	        
	        for(int i : lost) {
	        	// 중복처리 - 여분이 있는 사람이 도둑을 맞았는지 확인 하는 작업 
	        	if(resSet.contains(i)) { 
	        		resSet.remove(i);//도둑을 맞았으면 여분이 없는 거랑 마찬가지임. 그래서 제거
	        	}else {
					lostSet.add(i);
				}
	        }
	        
	        // 여분을 기준으로 앞뒤로 확인하여 체육복을 빌려준다.

	        for(int i : resSet) {
	        	if(lostSet.contains(i-1)) { //나보다 앞에 학생이 존재한다면 
	        		lostSet.remove(i-1);
	        	}else if (lostSet.contains(i+1)) { // 나보다 뒤의 학생이 체육복이 필요하다면
					lostSet.remove(i+1);
				}
	        }
	        
	        // 전체 학생 수에서 lostSet에 남은 학생수를 빼준다.
	   
	        answer = n - lostSet.size();
	        return answer;
	    }
	}
}


//풀이참고 유튜브 : https://www.youtube.com/watch?v=Fbw7A4CS_-A