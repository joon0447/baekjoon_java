import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            double dogs = Double.parseDouble(arr[0]);
            double food = Double.parseDouble(arr[1]);
            double price = Double.parseDouble(arr[2]);
            double result = dogs * food * price;
            System.out.print("$");
            System.out.println(String.format("%.2f",+result));
        }
    }
}
