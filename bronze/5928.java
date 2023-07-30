import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int D = Integer.parseInt(arr[0]);
        int H = Integer.parseInt(arr[1]) - 11;
        int M = Integer.parseInt(arr[2]) - 11;

        int sDay = (D-11)*24*60;
        int result = sDay+(H*60)+M;
        System.out.println((result)<0 ? -1 : result);


    }
}
