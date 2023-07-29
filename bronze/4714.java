import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            double a = Double.parseDouble(br.readLine());
            if(a <0) break;
            double result = a * 0.167;
            System.out.println("Objects weighing " + String.format("%.2f",a) + " on Earth will weigh " + String.format("%.2f", result) + " on the moon.");
        }
    }
}
