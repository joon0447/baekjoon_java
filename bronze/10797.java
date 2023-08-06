import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i=0; i<5; i++){
            if(a==Integer.parseInt(st.nextToken())){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
