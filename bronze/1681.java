import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        String l = st.nextToken();
        int count = 0;
        for(int i=1;; i++){
            if(String.valueOf(i).contains(l)){
                continue;
            }
            count++;
            if(count == n){
                System.out.println(i);
                return;
            }
        }

    }
}
