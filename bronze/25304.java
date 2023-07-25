import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int price, how, sum = 0;
        for(int i=0; i<N; i++){
            String[] arr = br.readLine().split(" ");
            price = Integer.parseInt(arr[0]);
            how = Integer.parseInt(arr[1]);
            sum += price*how;
        }
        String answer = X == sum ? "Yes" : "No";
        System.out.println(answer);
    }
}

