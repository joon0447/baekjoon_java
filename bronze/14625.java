import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int K = Integer.parseInt(arr[2]);
        int count = -1;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                count++;
                if(count == K) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
