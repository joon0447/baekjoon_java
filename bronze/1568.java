import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=1;;i++){
            if(n<i) i=1;
            n-=i;
            count++;
            if(n==0){
                System.out.println(count);
                return;
            }
        }
    }
}
