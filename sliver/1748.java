import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        int cnt = 1;
        int length = 10;
        for(int i=1; i<=n; i++){
           if(i==length){
               cnt++;
               length *= 10;
           }
           answer +=cnt;
        }

        System.out.println(answer);
    }
}
