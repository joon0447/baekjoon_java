import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int diff = B-A;
        int fine = 0;
        if(diff<=20 && diff>=1) fine = 100;
        else if(diff<=30 && diff>=21) fine = 270;
        else if(diff>=31) fine = 500;
        System.out.println((fine==0) ? "Congratulations, you are within the speed limit!" : "You are speeding and your fine is $" + fine + ".");
    }
}
