import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        String[] arr2 = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            System.out.print(Integer.parseInt(arr2[i])-a +" ");
        }
    }
}


