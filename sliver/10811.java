import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = i;
        }
        int[] copy = Arrays.copyOfRange(arr, 1,3);

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            reverse(arr, a,b);
        }

        for(int i=1; i<=n; i++){
            sb.append(arr[i] +" ");
        }

        System.out.println(sb);
    }



    public static void reverse(int[] arr, int a, int b){
        int[] copy = Arrays.copyOfRange(arr, a,b+1);
        int len = copy.length;
        for(int i=0; i<len; i++){
            arr[a+i] = copy[len -(i+1)];
        }
    }

}
