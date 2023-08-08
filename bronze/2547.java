import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            String blank = br.readLine();
            BigInteger n = new BigInteger(br.readLine());
            BigInteger sum = BigInteger.ZERO;
            for(int k=0; k<n.intValue(); k++){
                BigInteger a = new BigInteger(br.readLine());
                sum = sum.add(a);
            }
            String result = ((sum.remainder(n)).compareTo(BigInteger.ZERO) == 0) ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
