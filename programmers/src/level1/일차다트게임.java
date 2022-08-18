package level1;

public class 일차다트게임 {

class Solution {
	public int solution(String dartResult) {
//	public static void main(String[] args) {
//		디버깅하면 이해가 쉬움!
//		String dartResult = "1D2S#10S";
        int answer = 0;
        
        String temp =""; // 숫자 저장
        int darts [] = new int[3]; // 세 번의 다트 게임 점수를 저장할 배열
        int idx = 0; // dart 배열에 접근할 인덱스
        
        for(int i =0; i<dartResult.length(); i++) {
        	
        	switch (dartResult.charAt(i)) {
        		// *인 경우는 자신과 이전의 점수 *2, idx는 S,D,T 처리 후 증가하기 때문에 idx-1, idx-2 후 *2
        		// 옵션이 있을 수도 있고 없을 수 도 있음
			case '*':
				darts[idx -1] *=2; // S,D,T 처리 후 인덱스가 증가되니 점수를 찾으려면 그 전 인덱스로 가야함, 현재 인덱스에는 값이 없음
				if(idx>1) darts[idx -2] *=2;
				break;
				// #은 자신의 점수를 음수로 만들기
        		// 옵션이 있을 수도 있고 없을 수 도 있음
			case '#':
				darts[idx -1] *=-1;
				break;
				
				// S는 1제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화
				// 왜냐하면 darts[0],darts[1],darts[2] 이렇게 한세트씩 넣을 거고
				// 점수와함께 보너스가 합계되므로 보너스 다음에 인덱스를 증가시키고 다음게임으로 넘어감
			case 'S':
				darts[idx] = (int)Math.pow(Integer.parseInt(temp),1);
				idx++;
				temp ="";
				break;
				// D는 2제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화 
			case 'D':
				darts[idx] = (int)Math.pow(Integer.parseInt(temp),2);
				idx++;
				temp =""; 
				break;
                // T는 3제곱, 다음 점수를 위해 idx를 증가시키고 정수를 저장하는 temp를 초기화 
			case 'T':
				darts[idx] = (int)Math.pow(Integer.parseInt(temp),3);
				idx++;
				temp ="";
				break;
			default:
				temp+=String.valueOf(dartResult.charAt(i));
				break;
			}
        	
        }
        for(int dart : darts) {
        	answer += dart;
        }
//        System.out.println(answer);
        return answer;
        }
	}
}

// 풀이 참고 블로그 :https://yeoeun-ji.tistory.com/110
// 풀이 참고 블로그 : https://fbtmdwhd33.tistory.com/216

