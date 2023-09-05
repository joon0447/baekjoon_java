import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = 0;
        }
        arr[0] = 1;
        int next = l;
        int count = 0;
        for(;;){
            for(int i=0; i<n; i++){
                if(arr[i]==m){
                    for(int k=0; k<n; k++){
                        count += arr[k];
                    }
                    System.out.println(count-1);
                    return;
                }
            }
            arr[next] += 1;
            if(arr[next]%2!=0){
                next = (next+l)%n;
            }else{
                if((next-l)<0){
                    next = n - (Math.abs(next-l)%n);
                }else{
                    next = (next-l)%n;
                }
            }
        }

    }
}
