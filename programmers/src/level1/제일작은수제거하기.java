package level1;

public class 제일작은수제거하기 {
	class Solution {
	    public int[] solution(int[] arr) {
	        int[] answer = new int[arr.length -1]; //제일 작은 수 하나 제거해야 함
	        
	        if(arr.length == 1) return new int[] {-1}; // [10]면 [-1]을 리턴  즉, 배열 길이가 1과 같다면 -1을 리턴.
	        
	        int min = arr[0]; // 제일 작은 값을 arr[0]에 임의로 저장
	        for(int i = 0 ; i < arr.length; i++) {
	        	min =Math.min(min, arr[i]);
	        }
	        
	        int cnt = 0; //인덱스 위치 활용
	        for(int i =0; i<arr.length; i++) {
	        	if(arr[i] != min) { //위에 반복문에서 작은값 찾은 것 과 다른 값 찾기
	        		answer[cnt] = arr[i]; // 리턴 할 배열에 다른 값 하나씩 저장
	        		cnt++; // 인덱스 위치 바꿔주기 위하여 cnt 활용
	        	}
	        }
	        return answer;
	    }
	}
}
