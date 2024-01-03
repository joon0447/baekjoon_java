import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Double> map = new HashMap<>();
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F",0.0);

        double scoreSum = 0;
        double sum =0;
        for(int i=0; i<20; i++){
            String str = br.readLine();
            String[] a = str.split(" ");
            double score = Double.parseDouble(a[1]);
            String grade = a[2];
            if (!a[2].equals("P")) {
                scoreSum += score;
                double sub = map.get(grade);
                sum += score * sub;
            }
        }
        if(Double.isNaN(sum/scoreSum)) {
            System.out.println(String.format("%.6f", 0.000000));
            return;
        }
        System.out.println(String.format("%.6f", sum/scoreSum));

    }
}
