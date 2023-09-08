import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();
        String a = br.readLine();
        StringBuilder sb = new StringBuilder();
        int result = 0;
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i)==' '){
                sb.append(' ');
                continue;
            }
            int tmp = p.charAt(i)-97;
            int key = a.charAt(i%a.length())-97;
            if(tmp-key<=0){
                result = tmp-key+122;
            }else{
                result = tmp-key+96;
            }
            sb.append((char) result);
        }
        System.out.println(sb);

    }
}
