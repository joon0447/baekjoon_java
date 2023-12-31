import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            int[][] arr = new int[n][m];
            int[][] arr2 = new int[n][m];


            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<m; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int j=0; j<m; j++){
                    arr2[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    sb.append(arr[i][j] + arr2[i][j] + " ");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
}
