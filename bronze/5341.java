import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int sum = 0;
            int a = Integer.parseInt(br.readLine());
            if(a==0) break;
            for(int i=a; i>=1; i--){
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
