import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double r = Double.parseDouble(st.nextToken());
        double c = Double.parseDouble(st.nextToken());
        double n = Double.parseDouble(st.nextToken());

        long row = (long) Math.ceil(r/n);
        long col = (long) Math.ceil(c/n);

        System.out.println(row*col);
    }
}
