import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N-(int)(N*0.22);
        int b = N-(int)(N*0.2*0.22);
        System.out.println(a + " " + b);
    }
}

