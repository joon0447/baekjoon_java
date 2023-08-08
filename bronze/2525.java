import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int hr = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());
        hr+=(min+time)/60;
        min = (min+time)%60;
        if(hr>=24){
            hr-=24;
        }
        System.out.println(hr +" "+ min);
    }
}
