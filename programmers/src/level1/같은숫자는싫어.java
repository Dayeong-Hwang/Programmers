package level1;

import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
    //이전 숫자와 같은지 비교하기 위한 방법 중에 스택 있음
    Stack<Integer> stack = new Stack<>();
        for(int num : arr){
            if(stack.isEmpty() || stack.peek() !=num){
                //스택이 빈경우와 스택의 맨위(이전 숫자)와 다른 경우 스택에 추가
                stack.push(num); 
                // 0번째 인덱스 값은 저장,
                // 그다음 1번째 인덱스를 stack.peek()과 비교하여 같은지 확인
                // stack.peek() 제일 위에 있는 값을 불러옴
            }
        }
        
       answer = new int[stack.size()];
        int idx =0;
        for (int num : stack){
            answer[idx++] = num;
        }
        
        return answer;
    }
}
