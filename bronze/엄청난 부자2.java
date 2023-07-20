import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] a = br.readLine().split(" ");
            BigInteger money = new BigInteger(a[0]);
            BigInteger how = new BigInteger(a[1]);
            System.out.println(money.divide(how));
            System.out.println(money.remainder(how));
        }
}
