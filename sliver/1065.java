import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        if(n<100){
            System.out.println(n);
            return;

        }

        answer = 99;
        for(int i=100; i<=n; i++){
            String str = String.valueOf(i);
            String[] arr = str.split("");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            if(b-a == c-b) answer++;
        }

        System.out.println(answer);
    }
}
