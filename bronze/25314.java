import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(true){
            if(N-4>=0){
               N -= 4;
               sb.append("long ");
            }else break;
        }
        sb.append("int");
        System.out.println(sb);
    }
}

