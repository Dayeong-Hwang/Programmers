package level1;

import java.util.ArrayList;

public class 모의고사 {
	class Solution {
	    public int[] solution(int[] answers) {
	        int[] answer = {};
	 
	        // 답안지
	        // 특정패턴이 반복되는 구간만 배열에 저장
	        int[] stu1 = {1,2,3,4,5}; //5개
	        int[] stu2 = {2,1,2,3,2,4,2,5}; // 8개
	        int[] stu3 = {3,3,1,1,2,2,4,4,5,5}; // 10개씩 반복


	        //정답을 맞추는 개수
	        int[] cnt = new int[3];

	        //채점
	        // stu1[i%stu1.length] : 접급하려는 요소 인덱스 % 배열의 길이의 나머지 값으로 접근
	        // i=10 일경우 stu1[10%5] = stu1[0] =1
	        // i=11 일경우 stu1[11%5] = stu1[1] =2
	        // i=12 일경우 stu1[12%5] = stu1[2] =3


	        for(int i = 0; i < answers.length; i++){
	             if(answers[i] == stu1[i%stu1.length]) {cnt[0]++;} // 답 1 = 답안지 1 이면 cnt 증가
	             if(answers[i] == stu2[i%stu2.length]) {cnt[1]++;} // 답 1 = 답안지 1 이면 cnt 증가
	             if(answers[i] == stu3[i%stu3.length]) {cnt[2]++;} // 답 1 = 답안지 1 이면 cnt 증가
	        }


	        //가장 많이 맞힌 개수 (최고개수)
	        int max = Math.max(Math.max(cnt[0],cnt[1]),cnt[2]);

	        // 가장많이 맞힌 수포자 찾기
	        ArrayList<Integer> list = new ArrayList<Integer>();

	        
	        // 최대값과 같은 수포자가 여러명일 수 있기 때문에 각각 경우에 따라 배열에 넣어줘야함
	        if(max == cnt[0]) {list.add(1);}
	        if(max == cnt[1]) {list.add(2);}
	        if(max == cnt[2]) {list.add(3);}

	        answer = new int [list.size()]; //수포자가 몇명일지 모르니...이렇게 선언

	        for(int i = 0; i<list.size(); i++){
	             answer[i] = list.get(i);
	        }
	  
	        return answer;
	    }
	}

}
