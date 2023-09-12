import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for(int i=1; i<s.length(); i++){
            String first = s.substring(0,i);
            String second = s.substring(i);

            int fResult = 1;
            int sResult = 1;


            for(int k=0; k<first.length(); k++){
                int a = Integer.parseInt(String.valueOf(first.charAt(k)));
                fResult*=a;
            }

            for(int k=0; k<second.length(); k++){
                int a = Integer.parseInt(String.valueOf(second.charAt(k)));
                sResult*=a;
            }

            if(fResult == sResult){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");

    }

}
