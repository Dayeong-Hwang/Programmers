package level1;

public class 행렬의덧셈 {
	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = arr1;
	         for(int i=0; i<arr1.length; i++){ // 행렬의 행만큼 반복 
	             for(int j=0; j<arr1[i].length; j++){ // 행렬의 열만큼 반복
	                 answer[i][j] += arr2[i][j]; //누적시킴
	             }
	         }
	        return answer;
	    }
	}
}
