import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean pass;
        int count = 0;
        for(int i=0; i<n; i++){
            pass = true;
            int num = Integer.parseInt(st.nextToken());
            if(num==1) continue;
            for(int j=2; j<=num/2; j++){
                if(num%j==0){
                    pass = false;
                    break;
                }
            }
            if(pass) count++;
        }
        System.out.println(count);
    }
}
