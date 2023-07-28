import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println("Gnomes:");
        for(int i=1; i<=N; i++){
            String[] s = br.readLine().split(" ");
            int[] arr = new int[3];
            for(int k=0; k<3; k++){
                arr[k] = Integer.parseInt(s[k]);
            }
            if((arr[0]<=arr[1] && arr[1]<=arr[2]) || (arr[0]>=arr[1] && arr[1]>=arr[2])) System.out.println("Ordered");
            else System.out.println("Unordered");
        }
    }
}
