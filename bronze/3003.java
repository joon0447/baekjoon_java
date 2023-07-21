import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] chess;
        int[] answer;
        chess = new int[] {1,1,2,2,2,8};
        answer = new int[] {0,0,0,0,0,0};
        for(int i=0; i<6; i++){
            answer[i] = chess[i] - Integer.parseInt(str[i]);
        }
        for(int i=0; i<6; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
