import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h =Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(m<45){
            int minus = 45 - m;
            if(h==0){
                h = 23;
            }else{
                h--;
            }
            m = 60-minus;
        }else{
            m -= 45;
        }

        System.out.println(h + " " + m);

    }
}
