import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0; i<=n; i++){
            for(int j=i; j<=n; j++){
                answer +=i;
                answer +=j;
            }
        }
        System.out.println(answer);
    }
}
