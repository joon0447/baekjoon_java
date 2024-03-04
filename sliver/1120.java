import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        int answer = a.length();

        for(int i=0; i<=b.length()-a.length(); i++){
            int cnt = 0;
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j) != b.charAt(j+i)){
                    cnt++;
                }
            }
            answer = Math.min(cnt, answer);
        }
        System.out.println(answer);


    }
}