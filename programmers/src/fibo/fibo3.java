package fibo;

public class fibo3 {// 동적계획 : 이미 계산한 것은 바로 반환해서 다시 계산하지않도록
	
	static long[] fibo; // 이미계산된 값 저장하는 변수
	final static int idx = 50; 
	
	public static void main(String[] args) {
		//F1 = F2 = 1;
		//Fn = F(n-1) + F(n-2)
		fibo = new long[idx+1]; //배열이니까
		System.out.println(fibonacci(idx));
		
		
	}
	
	
	public static long fibonacci(int n) {
		fibo[0] = 1;
		fibo[1] = 1;
		
		for(int i =2; i<=n; i++) {
			fibo[i] =fibo[i-1] +fibo[i-2];
			
		}
		return fibo[n];
		
	}
}
