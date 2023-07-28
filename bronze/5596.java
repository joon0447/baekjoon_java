import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] m = br.readLine().split(" ");
        String[] s = br.readLine().split(" ");
        int sum1 = 0, sum2=0;
        for(int i=0; i<4; i++){
            sum1 += Integer.parseInt(m[i]);
            sum2 += Integer.parseInt(s[i]);
        }
        System.out.println(Math.max(sum1, sum2));
    }
}
