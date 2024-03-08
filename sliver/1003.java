import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int zero_count = 0;
    static int one_count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<t; i++){
            fibonacci(Integer.parseInt(br.readLine()));
            sb.append(zero_count).append(' ').append(one_count).append('\n');
            zero_count = 0;
            one_count = 0;
        }
        System.out.println(sb);

    }

    public static void fibonacci(int n){
        int tmp1 = 0;
        int tmp2 = 1;
        int tmp =0;

        if(n==0){
            zero_count++;
            return;
        }else if(n==1){
            one_count++;
            return;
        }else{
            for(int i=1; i<n; i++){
                tmp = tmp1 + tmp2;
                tmp1 = tmp2;
                tmp2 =tmp;
            }
            zero_count = tmp1;
            one_count = tmp2;
        }
    }
}
