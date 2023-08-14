import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int fm = m;
        int M = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int answer = 0;

        while(true){
            if(fm+t>M){
                System.out.println(-1);
                break;
            }
            if(m+t<=M){
                m += t;
                answer++;
                n--;
            }else{
                if(m-r>=fm){
                    m -= r;
                }else{
                    m = fm;
                }
                answer++;
            }
            if(n==0){
                System.out.println(answer);
                break;
            }
        }
    }
}
