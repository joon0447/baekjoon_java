import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        int[] B = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n ;i++){
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = A[i];
        }

        Arrays.sort(B);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(A[i] == B[j]){
                    sb.append(j + " ");
                    B[j] = -1;
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
