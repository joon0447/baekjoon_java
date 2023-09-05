import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            int answer = 0;
            StringTokenizer st = new StringTokenizer(s);
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            answer = n;
            int stamp = n;
            while(stamp>=k){
                answer += (stamp)/k;
                stamp = stamp/k + stamp%k;
            }
            System.out.println(answer);
        }

    }
}
