import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long row = Long.parseLong(st.nextToken());
        long col = Long.parseLong(st.nextToken());

        if(row % 2 == 0 || col % 2 == 0) System.out.println(0);
        else{
            System.out.println(Math.min(row,col));
        }
    }
}
