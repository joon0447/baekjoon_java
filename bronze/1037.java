import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int max = first;
        int min = first;
        for(int i=1; i<n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp<min){
                min = tmp;
            }

            if(tmp>max){
                max = tmp;
            }
        }

        System.out.println(max * min);
    }
}
