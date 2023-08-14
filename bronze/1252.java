import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        BigInteger A = new BigInteger(a,2);
        BigInteger B = new BigInteger(b,2);
        BigInteger sum = A.add(B);
        System.out.println(sum.toString(2));
    }
}
