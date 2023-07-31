import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n;
        int result;
        while(true){
            n = br.readLine().split("");
            if(n[0].equals("0")) break;
            result = 2 + n.length-1;
            for(int i=0; i<n.length; i++){
                if(n[i].equals("1")) result += 2;
                else if(n[i].equals("0")) result +=4;
                else result += 3;
            }
            System.out.println(result);
        }
    }
}
