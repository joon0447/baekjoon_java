import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int answer = 0;
        for(int i=0; i<6; i++){
            answer += Integer.parseInt(arr[i])*5;
        }
        System.out.println(answer);
    }
}

