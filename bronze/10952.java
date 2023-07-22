import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int s;
        while((s=sc.nextInt()) != 0){
            System.out.println(s+sc.nextInt());
        }
    }
}
