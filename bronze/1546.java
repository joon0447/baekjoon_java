import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        double nSum = 0;
        double M = 0;

        for(int i=0; i<n; i++){
            int score = Integer.parseInt(arr[i]);
            M = Math.max(M, score);
        }

        for(int i=0; i<n; i++){
            nSum += Double.parseDouble(arr[i])/M*100;
        }
        System.out.println(nSum/n);
    }
}
