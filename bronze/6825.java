import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double w = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());
        double BMI = w / Math.pow(h,2);
        if(BMI>=25) System.out.println("Overweight");
        else if(BMI>=18.5 && BMI<25) System.out.println("Normal weight");
        else System.out.println("Underweight");
    }
}
