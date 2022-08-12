package level1;

import java.util.Arrays;

public class K번째수 {
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];
	        // Arrays.copyOfRange(A, form_index, to_index)
	        // int[] A : 복사할 배열
	        // int from_index : 복사할 배열의 시작 index
	        // int to_index : 복사할 배열의 끝 index 
	        // 복사할 끝 index 값은 포함 안됨 
	        
	        int index = 0;
	        
	        for(int [] command : commands){
	            int i = command[0];
	            int j = command[1];
	            int k = command[2];
	            
	            // 자를 때 주어지는  i = 2, j = 5, k = 3 여기서 -1해야함 왜냐하면 인덱스는 0부터 시작하니까
	          
	            int[] result = Arrays.copyOfRange(array, i-1, j);
	            Arrays.sort(result); // 정렬
	            
	            answer[index++] = result[k-1];
	        }
	        return answer;
	    }
	}
}
