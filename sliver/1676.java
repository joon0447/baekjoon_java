import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int answer = 0;

        while(a>=5){
            answer += a/5;
            a /= 5;
        }

        System.out.println(answer);
    }
}
