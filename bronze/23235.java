import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1;;i++){
            String a = br.readLine();
            if(a.equals("0")) break;
            else{
                System.out.println("Case " + i +": Sorting... done!" );
            }
        }
    }
}
