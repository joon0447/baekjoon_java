import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] a = br.readLine().split(" ");
            int sum = 0;
            for(int i=0; i<5; i++){
                sum += Math.pow(Integer.parseInt(a[i]), 2);
            }
            System.out.println(sum%10);
        }
}
