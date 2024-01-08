import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while(true){
            if(n%5==0){
                System.out.println(answer + n/5);
                return;
            }else if(n<0){
                System.out.println(-1);
                return;
            }
            n = n-3;
            answer++;
        }
    }
}
