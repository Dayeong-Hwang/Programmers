package level1;

import java.util.Stack;

public class 크레인인형뽑기게임 {
	class Solution {
	    public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        
	        //바구니 역할인 stack을 선언한 뒤 0을 넣어줌 - 비교할 대상이 없으면 오류 발생
	        Stack<Integer> stack = new Stack<Integer>();
	        stack.push(0);
	        
	        //인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves 만큼 for문 반복
	        for(int move:moves){
	            for(int i =0; i<board.length; i++){// 해당 라인에서 인형을 뽑기 위해 board의 길이만큼 for문 반복
	                        //moves 배열 각 원소들의 값은 1 이상
	                if(board[i][move -1] != 0){// board[j][move - 1]이 0이라면 인형이 없음 따라서 아닐때에 돌려야함
	                    if(stack.peek() == board[i][move-1]){
	                        stack.pop();
	                        answer += 2; // 같은 모양 인형 두 개가 없어지기때문에
	                    } else {
	                        stack.push(board[i][move-1]);
	                    }
	                    // 해당 작업 끝난 후에는 인형을 빼냈으므로 0으로 (인형이 없다는 표시)
	                    board[i][move - 1] =0;
	                    break;
	                }
	                
	            }
	        }
	        return answer;
	    }
	}

}



// push(E item) : item을 Stack의 top에 삽입
// pop() : top에 있는 item을 삭제하고 item을 반환
// peek() : top에 있는 item을 삭제하지 않고 item을 반환
// empty() : Stack이 비어있으면 true를 그렇지 않으면 false 반환



// 풀이 참고1 : https://zzang9ha.tistory.com/224
// 풀이 참고2 : https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%ED%81%AC%EB%A0%88%EC%9D%B8-%EC%9D%B8%ED%98%95%EB%BD%91%EA%B8%B0-%EA%B2%8C%EC%9E%84-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
// 풀이 참고3 : https://yeoeun-ji.tistory.com/107