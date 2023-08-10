import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int result = 0;
            int n = Integer.parseInt(br.readLine());
            for(int k=1; k<=n; k++){
                int fact = 0;
                for(int f=1; f<=k+1; f++){
                    fact += f;
                }
                result += k*fact;
            }
            System.out.println(result);
        }
    }
}
