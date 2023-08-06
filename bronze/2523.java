import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            for(int k=0; k<i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<n-1; i++){
            for(int k=0; k<n-1-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
