import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger apple = new BigInteger(br.readLine());
        BigInteger more = new BigInteger(br.readLine());
        BigInteger T = new BigInteger("2");
        BigInteger K = (apple.subtract(more)).divide(T).add(more);
        BigInteger N = (apple.subtract(more)).divide(T);
        System.out.println(K);
        System.out.println(N);
    }
}
