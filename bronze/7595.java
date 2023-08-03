import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a==0) break;
            for(int i=0; i<a; i++){
                for(int k=0; k<i+1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
