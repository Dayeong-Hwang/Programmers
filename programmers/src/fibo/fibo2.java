package fibo;

public class fibo2 {// 동적계획 : 이미 계산한 것은 바로 반환해서 다시 계산하지않도록
	
	static long[] fibo; // 이미계산된 값 저장하는 변수
	final static int idx = 50; 
	
	public static void main(String[] args) {
		//F1 = F2 = 1;
		//Fn = F(n-1) + F(n-2)
		
		fibo = new long[idx+1]; //배열이니까
		System.out.println(fibonacci(idx)); //값이 올라가면 int 범위를 벗어나니까 long으로
		
		
	}
	
	
	public static long fibonacci(int n) {
		if(n == 0 || n == 1) { //배열의 0번째, 1번째			
			return 1;
		}
		
		
		if(fibo[n] != 0) { //피보나치수열은 0부터 시작하기때문에 0이 아니면 이미 계산한적이 있다는 말!
			return fibo[n];
		}
		
		fibo[n] = fibonacci(n-1) +fibonacci(n-2);
		
		return fibo[n];
		
	}
}
