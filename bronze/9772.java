import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            if(x==0 && y==0){
                System.out.println("AXIS");
                break;
            }
            if(x>0 && y>0) System.out.println("Q1");
            else if(x>0 && y<0) System.out.println("Q4");
            else if(x<0 && y>0) System.out.println("Q2");
            else if(x<0 && y<0) System.out.println("Q3");
            else if(x==0 || y==0) System.out.println("AXIS");
        }
    }
}
