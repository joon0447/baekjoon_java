import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr;
        for(int i=0; i<T; i++){
            arr = br.readLine().split(" ");
            int A = Integer.parseInt(arr[0]);
            int B = Integer.parseInt(arr[1]);
            System.out.println("Case #"+(i+1)+": " + A + " + " + B + " = " + (A+B));
        }
    }
}
