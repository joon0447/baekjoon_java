import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split(" ");
            BigInteger lt = new BigInteger(arr[0]);
            BigInteger wt = new BigInteger(arr[1]);
            BigInteger Tel = lt.multiply(wt);
            BigInteger le = new BigInteger(arr[2]);
            BigInteger we = new BigInteger(arr[3]);
            BigInteger Eur = le.multiply(we);
            if(Tel.compareTo(Eur) == 0){
                System.out.println("Tie");
            } else if (Tel.compareTo(Eur) == -1) {
                System.out.println("Eurecom");
            }else
                System.out.println("TelecomParisTech");
        }
    }
}

