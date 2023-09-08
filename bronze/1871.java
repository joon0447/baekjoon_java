import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), "-");
            String str = st.nextToken();
            int a = 0;
            int b = Integer.parseInt(st.nextToken());

            for (int k = 0; k < str.length(); k++) {
                int c = str.charAt(k) - 65;
                int pow = (int) Math.pow(26, str.length() - k - 1);
                a += c*pow;
            }

            if(Math.abs(a-b)<=100) System.out.println("nice");
            else System.out.println("not nice");
        }
    }
}
