import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int a = hr - 9;
        int b = min;
        System.out.println(a*60+b);
    }
}


