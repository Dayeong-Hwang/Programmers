package level1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;
        
        int x = 1;
        while (n % x != 1){
            x++;
        }
        
        return answer = x;
    }
}
