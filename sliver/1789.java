import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        int count = 0;
        long sum = 0;

        for(int i=1;;i++){
            if(sum>s){
                System.out.println(count-1);
                return;
            }
            sum+=i;
            count++;
        }
    }
}
