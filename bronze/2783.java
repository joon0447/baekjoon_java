import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double X = Double.parseDouble(st.nextToken());
        double Y = Double.parseDouble(st.nextToken());
        double min = (X/Y)*1000;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer std = new StringTokenizer(br.readLine());
            X = Double.parseDouble(std.nextToken());
            Y = Double.parseDouble(std.nextToken());
            min = Math.min(min, X/Y*1000);
        }
        System.out.println(String.format("%.2f", min));
    }
}
