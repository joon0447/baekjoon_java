import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr2[0]);
        int d = Integer.parseInt(arr2[1]);
        Double[] sum = new Double[4];
        sum[0] = (double)a/c + b/d;
        sum[1] = (double)c/d + a/b;
        sum[2] = (double)d/b + c/a;
        sum[3] = (double)b/a + d/c;
        System.out.println(Arrays.asList(sum).indexOf(Collections.max(Arrays.asList(sum))));



    }
}
