import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int diff = sc.nextInt();
        int A = (sum+diff)/2;
        int B = A-diff;
        if(A<0 || B<0 || (sum+diff)%2!=0) System.out.println(-1);
        else System.out.println(A + " " + B);
    }
}
