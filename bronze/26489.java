import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String str = "";
        while(true){
            str = br.readLine();
            if(str == null) break;
            answer++;
        }
        System.out.println(answer);
    }
}


