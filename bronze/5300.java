import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++) {
            sb.append(i+" ");
            if(i%6==0 || i==n) sb.append("Go! ");
        }
        System.out.println(sb);
    }
}
