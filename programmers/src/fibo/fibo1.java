package fibo;

public class fibo1 {// 재귀적 호출
	public static void main(String[] args) {
		//F1 = F2 = 1;
		//Fn = F(n-1) + F(n-2)
		System.out.println(fibonacci(5));
		
		
	}
	
	
	public static int fibonacci(int n) {
		if(n == 0 || n == 1) { //배열의 0번째, 1번째			
			return 1;
		}
		
		return fibonacci(n-1) +fibonacci(n-2); //중복연산
	}
}
