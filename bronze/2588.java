import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String[] b = br.readLine().split("");
        for(int i=2; i>=0; i--){
            int result = a*Integer.parseInt(b[i]);
            System.out.println(result);
        }
        int bb = Integer.parseInt(String.join("",b));
        System.out.println(a*bb);

    }
}
