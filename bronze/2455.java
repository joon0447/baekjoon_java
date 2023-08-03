import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int total = Integer.parseInt(arr[1]);
        int max = 0;
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int out = Integer.parseInt(st.nextToken());
            int in = Integer.parseInt(st.nextToken());
            total += (in-out);
            max = Math.max(max, total);
        }
        System.out.println(max);
    }
}
