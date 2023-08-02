import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int answer = 1;
            int a = Integer.parseInt(st.nextToken());
            if(a==0) break;
            for(int i=0; i<a; i++){
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                answer = answer * n-m;
            }
            System.out.println(answer);
        }
    }

}
