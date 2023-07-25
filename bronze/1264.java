import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;;i++){
            int answer = 0;
            String a = br.readLine().toLowerCase();
            if(a.equals("#")) break;
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j)=='a' || a.charAt(j)=='e' || a.charAt(j)=='i' || a.charAt(j)=='o' || a.charAt(j)=='u'){
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }
}

