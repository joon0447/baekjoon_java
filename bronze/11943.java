import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        StringTokenizer std = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(std.nextToken());
        int d = Integer.parseInt(std.nextToken());
        System.out.println(Math.min(a+d, b+c));

    }
}