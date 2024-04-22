import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] sumArr = new int[n+1];
        st  = new StringTokenizer(br.readLine());
        arr[0] = 0;
        sumArr[0] = 0;
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(i==1) sumArr[i] = arr[i];
            else sumArr[i] = sumArr[i-1] + arr[i];
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = 0;
            if (a ==1) {
                result = sumArr[b];
            }else{
                result = sumArr[b] - sumArr[a-1];
            }
            sb.append(result).append("\n");
        }


        System.out.println(sb);
    }
}
