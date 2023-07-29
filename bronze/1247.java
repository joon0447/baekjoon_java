import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        BigInteger sum;
        for(int i=0; i<3; i++){
            sum = BigInteger.ZERO;
            n = Integer.parseInt(br.readLine());
            for(int j=0; j<n; j++){
                BigInteger a = new BigInteger(br.readLine());
                sum = sum.add(a);
            }
            if(sum.equals(BigInteger.ZERO)) System.out.println(0);
            else if(sum.compareTo(BigInteger.ZERO)<0) System.out.println("-");
            else System.out.println("+");
        }

    }
}
