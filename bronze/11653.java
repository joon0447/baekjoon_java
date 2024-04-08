import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        gcd(n);
    }

    public static void gcd(int a){
        StringBuilder sb = new StringBuilder();
        for(int i =2; i<=Math.sqrt(a); i++){
            while(a%i==0){
                sb.append(i).append('\n');
                a /= i;
            }
        }
        if(a!=1){
            sb.append(a).append('\n');
        }
        System.out.println(sb);
    }
}
