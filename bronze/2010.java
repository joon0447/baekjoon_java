import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            if(i==n-1){
                answer += a;
            }else{
                answer += a-1;
            }
        }
        System.out.println(answer);
    }
}
