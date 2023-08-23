import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(c);
        if(b.equals("+")){
            System.out.println(A.add(B));
        }else{
            System.out.println(A.multiply(B));
        }
    }
}
