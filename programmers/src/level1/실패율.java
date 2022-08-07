package level1;
import java.util.*;

public class 실패율 {
	class Solution {
		class Fail { // 실패율을 저장, 나중에 실패율에 따라 스테이지를 정렬해야하고 스테이지로 리턴해야함 실패율이아님!
			int stage;
			double rate;
			
			public Fail(int stage, double rate) {
				this.stage = stage;
				this.rate = rate;
			}
		} // class Fail 끝
		
		
//		Comparator<Fail> comp = new Comparator<Fail>() {
//			
//			@Override
//			public int compare(Fail a, Fail b) {
//				if(a.rate < b.rate) { //실패율이 큰것이 앞으로 와야함
//					return 1;
//				} else if (a.rate > b.rate) {
//					return -1;
//				} else { // 실패율이 같은 경우니까 스테이지가 작은게 앞으로 오도록 정렬
//					if(a.stage > b.stage) {
//						return 1;
//					} else if (a.stage < b.stage) {
//						return -1;
//					} else {
//						return 0;
//					}
//				}
//			}
//		};
		
		
	    public int[] solution(int N, int[] stages) {
	        int[] answer = {};
	        // N  = 스테이지 개수
	        // 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages
	        answer = new int[N]; //스테이지 개수와 같으니까
	        
	        List<Fail> fails = new ArrayList<Fail>();
	       
	        // 실패율을 구하기 위해 전체 사용자 명수 구하기
	        int total = stages.length; 
	        
	        
	        // 각 스테이지에 도달한 사용자를 카운트 하기 위해서 
	        int[] users = new int[N+1]; //마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자가 있을 수도 있으니 n+1
	        		
	        for(int s : stages) {     	
	        	//stages를 인덱스로 씀.but 0부터 카운트하기 위해서 s-1
	        	users[s-1]++; // 따라서 1번 스테이지 사용자 수는 0번째 인덱스에 저장
	        }
	        
	        
	        for(int i = 0; i<N; i++) { //각각의 스테이지에 실패율 구하기
	        	if(users[i] == 0) {
	        		fails.add(new Fail(i+1, 0)); 
	        		// 위에서(users[s-1]++;) 이렇게 했으니 원래 스테이지를 돌려줄땐 i+1을 하고 
	        		// 스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의해야하기 때문에 0을 입력
	        	}else {
					fails.add(new Fail(i+1, (double)users[i]/total));
					// 현재 스테이지에 머물고 있는 사용자 users[i] 즉, 현재 스테이지를 클리어하지 못한
					// 결과가 실수가 될 수 있도록 (double)users[i]/total)
					
					total -= users[i];
					// 현재 스테이지를 클리어하지 못하면 다음 스테이지에 못가니까
				}
	        	
	        }
	        
	        // 정렬
//	        Collections.sort(fails, comp);
	        // 람다식으로 표현
	        Collections.sort(fails,((o1, o2) -> Double.compare(o2.rate, o1.rate)));
	        
	        for(int i = 0 ; i<N; i ++) {
	        	answer[i] = fails.get(i).stage;
	        }
	        
	        return answer;
	    }
	}

}

// 풀이 참고 유튜브 : https://www.youtube.com/watch?v=hmHparvw4Wo