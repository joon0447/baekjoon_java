import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        String[] arr = br.readLine().split(" ");
        for(int i =0; i<N; i++){
            if(Integer.parseInt(arr[i])<X) sb.append(arr[i] + " ");
        }
        String answer = sb.toString();
        System.out.println(answer);
    }
}
