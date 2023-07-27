import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int A = Integer.parseInt(arr[1]);
        int B = Integer.parseInt(arr[2]);
        System.out.println((A<B) ? "Bus" : (A>B) ? "Subway" : "Anything");
    }
}


