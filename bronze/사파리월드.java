import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split(" ");
            long a = Integer.parseInt(str[0]);
            long b = Integer.parseInt(str[1]);
            System.out.println(Math.abs(a-b));
        }
}
