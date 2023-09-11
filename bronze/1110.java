import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = String.format("%02d", Integer.parseInt(br.readLine()));
        String first = n;
        for(int cycle=1;;cycle++){
            n = String.format("%02d", Integer.parseInt(n));
            char a = n.charAt(0);
            char b = n.charAt(1);
            String result = String.valueOf(Integer.parseInt(String.valueOf(a))+Integer.parseInt(String.valueOf(b)));
            char c = result.charAt(result.length()-1);
            n = String.valueOf(b) + String.valueOf(c);
            if(first.equals(n)){
                System.out.println(cycle);
                break;
            }
        }
    }
}
