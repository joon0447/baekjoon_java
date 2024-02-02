import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++){
            long answer = 0;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for(int j=0; j<n; j++){
                for (int k=j+1; k<n; k++){
                    answer += gcd(arr[j], arr[k]);
                }
            }
            System.out.println(answer);
        }
    }

    public static int gcd(int a, int b){
        while (b !=0){
            int r = a%b;

            a=b;
            b=r;
        }
        return a;
    }
}
