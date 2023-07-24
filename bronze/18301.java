import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()+1;
        int b = sc.nextInt()+1;
        int c = sc.nextInt()+1;
        int answer = a*b/c-1;
        System.out.println(answer);
    }
}

