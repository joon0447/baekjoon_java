import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int d = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        double a = Math.pow(h,2) + Math.pow(w,2);
        double b = Math.pow(d,2);
        double x = Math.sqrt(b/a);
        System.out.println((int)Math.floor(h*x) + " " + (int)Math.floor(w*x));
    }
}
