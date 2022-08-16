package level1;

public class 일차비밀지도 {
//	public static void main(String[] args) {
//		int n = 5;
//		int[] arr1 = {9, 20, 28, 18, 11};
//		int[] arr2 = {30, 1, 21, 17, 28};
//		
		class Solution {
		    public String[] solution(int n, int[] arr1, int[] arr2) {
		     String[] answer =new String[n];
				for (int i =0; i< n; i++) { // | -> 둘 중 하나라도 1이면 1, 아니면 0 (OR)
					answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
					
					// 이진수로 변환했을 경우 숫자의 길이가 n길이와 맞지 않을 수 있기 때문에 format 함수를 이용해 길이를 맞춰줌
					// %s 앞에 숫자(N)를 설정할 경우, str.length()가 N보다 작을 경우 앞에 공백을 추가
					// %05d → 5자리수, 공백을 0으로 채움 : 앞에 0을 붙여도 됨 생략 안하고
					answer[i] = String.format("%"+n+"s", answer[i]); // n개의 자릿수만큼 문자열 담기
					
					
					answer[i] = answer[i].replace("1", "#"); // 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽
					answer[i] = answer[i].replace("0", " ");// 지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백
				}
			      return answer;
		    }
		}
}

//풀이참고 블로그 : https://wooaoe.tistory.com/53