import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String words = br.readLine();
        int count = 0;
        for(int i=0; i<N; i++){
            int a = (int)words.charAt(i);
            if(a==97 || a==101 || a==105 || a==111 || a==117){
                count++;
            }
        }
        System.out.println(count);
    }
}

