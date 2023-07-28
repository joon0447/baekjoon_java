import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++){
            String[] arr = br.readLine().split(" ");
            int h1 = Integer.parseInt(arr[0]) * 3600;
            int m1 = Integer.parseInt(arr[1]) * 60;
            int s1 = Integer.parseInt(arr[2]);
            int in = h1 + m1 + s1;

            int h2 = Integer.parseInt(arr[3]) * 3600;
            int m2 = Integer.parseInt(arr[4]) * 60;
            int s2 = Integer.parseInt(arr[5]);
            int out = h2+m2+s2;

            int h = (out-in)/3600;
            int m = (out-in-(h*3600))/60;
            int s = out-in-(h*3600)-(m*60);
            System.out.println(h+" "+m+" " +s);
        }
    }
}
