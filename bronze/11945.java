import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split("");
            for(int k=arr.length-1; k>=0; k--){
                sb.append(arr[k]);
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }
}
