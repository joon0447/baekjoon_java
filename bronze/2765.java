import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int miToin = 63360;
        for(int i=1;;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(b==0) break;
            double c =Double.parseDouble(st.nextToken());
            double distance = a*Math.PI*b/miToin;
            double avg = (distance*3600)/c;
            System.out.println("Trip #" + i+": " + String.format("%.2f", distance) +" " + String.format("%.2f",avg));
        }
    }
}
