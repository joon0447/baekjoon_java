import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean arr[] = new boolean[n+1];
        int count = 0;

        for(int i=2; i<=n; i++){
            arr[i] = true;
        }

        for(int i=2; i<=n; i++){
            for(int j=i; j<=n; j+=i){
                if(!arr[j])
                    continue;
                arr[j] = false;
                count++;
                if(count == k){
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
