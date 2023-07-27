import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");
        int A = Integer.parseInt(N[0]);
        int B = Integer.parseInt(N[1]);
        int answer = A==B ? 1 : 0;
        System.out.println(answer);
    }
}
