import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int N = sc.nextInt();
            int S = sc.nextInt();
            if(N<=0 || S<=0) break;
            String answer = N > S ? "Yes" : "No";
            System.out.println(answer);
        }
    }
}
