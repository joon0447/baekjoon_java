import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        BigInteger A = new BigInteger(a[0]);
        BigInteger B = new BigInteger(a[1]);
        System.out.println(A.add(B));
    }
}

