import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int k=0; k<(2*n-1)-2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int k=i-1; k>0; k--){
                System.out.print(" ");
            }
            for(int k=0; k<(2*n-2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
