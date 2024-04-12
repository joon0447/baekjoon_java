import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
            arr = new int[3];

            arr[0] = Integer.parseInt(st.nextToken());
            if(arr[0]==0){
                System.out.println(sb);
                return;
            }
            arr[1]= Integer.parseInt(st.nextToken());
            arr[2]= Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            if(arr[0]==arr[1] && arr[1]==arr[2]){
                sb.append("Equilateral");
            }
            else if(arr[2]>=arr[0]+arr[1]){
                sb.append("Invalid");
            }
            else if(arr[1]==arr[2] || arr[0]==arr[1]){
                sb.append("Isosceles");
            }
            else{
                sb.append("Scalene");
            }
            sb.append("\n");
        }

    }
}
