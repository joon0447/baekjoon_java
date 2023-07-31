import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int Y =0, M =0;
        int time;
        String[] arr = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            time = Integer.parseInt(arr[i]);
            Y+= (time/30+1)*10;
            M+= (time/60+1)*15;
        }
        System.out.println((Y>M) ? "M " + M : (Y==M) ? "Y M " + Y : "Y " + Y);

    }
}
