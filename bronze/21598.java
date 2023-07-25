import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        for(BigInteger i = BigInteger.valueOf(0); i.compareTo(N)<0 ; i=i.add(BigInteger.ONE)){
            System.out.println("SciComLove");
        }
    }
}

