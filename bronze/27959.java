import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int N = Integer.parseInt(arr[0])*100;
        int M = Integer.parseInt(arr[1]);
        System.out.println((N>=M) ? "Yes":"No");
    }
}
