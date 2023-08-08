import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<7; i++){
            int num = Integer.parseInt(br.readLine());
            if(num%2!=0){
                arr.add(num);
                sum+=num;
            }
        }
        if(arr.size()==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(Collections.min(arr));
        }

    }
}
