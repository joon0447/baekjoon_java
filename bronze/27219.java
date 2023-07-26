import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int V = n/5;
        int I = n%5;
        for(int i=0; i<V; i++){
            System.out.print("V");
        }
        for(int i=0; i<I; i++){
            System.out.print("I");
        }
    }
}


