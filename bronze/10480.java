import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int a =Integer.parseInt(br.readLine());
            if(a%2==0) System.out.println(a + " is even");
            else System.out.println(a + " is odd");
        }
    }
}
