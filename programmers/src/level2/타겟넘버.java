package level2;

class Solution2 {
	int answer = 0; // 정답 카운트를 저장할 전역변수 answer 선언 및 초기화

	public int solution(int[] numbers, int target) {
		dfs(numbers, 0, target, 0);
		return answer;

	}

	// 깊이 우선 탐색(문제에서 덧셈/뺄셈으로 타겟넘버를 만든다는 문구가 있어서 더하는 방법 & 빼는 방법을 구현하기 위해 DFS를 활용)
	public void dfs(int[] numbers, int depth, int target, int sum) {
		// numbers : 알고리즘을 실행할 대상 배열
		// depth : 노드의 깊이
		// target : 타겟 넘버
		// sum : 이전 노드 까지의 결과 값

		// 마지막 노드까지 탐색했을 경우, 즉 depth와 numbers 배열의 길이가 같을 때에는 target과 sum값을 비교하여 일치하면
		// answer 카운트 증가
		// 탐색할 노드가 남아있는 경우 이전 노드까지의 합에서 현재 노드 값을 더하고 빼는 두 가지 경우로 깊이 우선 탐색 알고리즘 재실행

		if (depth == numbers.length) { // 마지막 노드 까지 탐색한 경우
			if (target == sum)
				answer++;
		} else {
			dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
			dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
		}
	}
}

// 참고 
// https://hyojun.tistory.com/entry/Programmers-%ED%83%80%EA%B2%9F-%EB%84%98%EB%B2%84-Java?category=980310
// https://machine-geon.tistory.com/134