import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            sb.append(search(arr, n, Integer.parseInt(st.nextToken()))).append(' ');
        }

        System.out.println(sb);

    }

    public static int search(int[] arr, int n, int card){
        int left = 0;
        int right = n-1;
        int mid = 0;

        while(left <= right){
            mid = (left + right) / 2;

            if(arr[mid] == card){
                return 1;
            }

            if(arr[mid] < card){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return 0;
    }
}
