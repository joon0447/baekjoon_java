import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        int count = 1;
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(st.nextToken());
            if(a==1){
                answer += 1*count;
                count++;
            }else{
                count = 1;
            }
        }
        System.out.println(answer);
    }
}
