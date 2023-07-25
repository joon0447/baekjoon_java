import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if(name.equals("#")) break;
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            if(age>17 || weight>=80){
                System.out.println(name + " Senior");
            }else{
                System.out.println(name + " Junior");
            }
        }
    }
}

