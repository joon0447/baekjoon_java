import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            boolean PASS = true;
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            for(int k=0; k<3; k++){
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                if(k==0) {
                    if (score < 35 * 0.3) {
                        PASS = false;
                    }
                }else if(k==1) {
                    if(score<25*0.3) {
                        PASS = false;
                    }
                }else {
                    if(score<40*0.3){
                        PASS = false;
                    }
                }
            }
            if(sum<55) PASS = false;
            System.out.println(name +" " + sum + " " + (PASS ? "PASS" : "FAIL"));
        }

    }
}
