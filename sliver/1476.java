import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int a = 1, b=1, c=1;
        int year = 1;
        while(true){
            if(a==e && b==s && c==m){
                System.out.println(year);
                return;
            }
            a++;
            b++;
            c++;
            if(a>15){
                a %= 15;
            }

            if(b>28){
                b %= 28;
            }

            if(c>19){
                c %= 19;
            }

            year++;
        }
    }
}
