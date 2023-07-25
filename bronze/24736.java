import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int sum_a = 0, sum_b=0;
        for(int i=0; i<5; i++){
            if(i==0){
                sum_a += Integer.parseInt(a[i]) * 6;
                sum_b += Integer.parseInt(b[i]) * 6;
            }else if(i==1){
                sum_a += Integer.parseInt(a[i]) * 3;
                sum_b += Integer.parseInt(b[i]) * 3;
            }else if(i==2){
                sum_a += Integer.parseInt(a[i]) * 2;
                sum_b += Integer.parseInt(b[i]) * 2;
            }else if(i==3){
                sum_a += Integer.parseInt(a[i]) * 1;
                sum_b += Integer.parseInt(b[i]) * 1;
            }else{
                sum_a += Integer.parseInt(a[i]) * 2;
                sum_b += Integer.parseInt(b[i]) * 2;
            }
        }
        System.out.println(sum_a + " " + sum_b);
    }
}

