import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int gcd(int a, int b){
        if(a<b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        while(b!=0){
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int denom = Integer.parseInt(st.nextToken());
        for(int i=0; i<n-1; i++){
            int mole = Integer.parseInt(st.nextToken());
            int gcd = gcd(denom, mole);
            sb.append(denom/gcd).append('/').append(mole/gcd).append('\n');
        }

        System.out.println(sb);
    }
}

