import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<6; i++){
            if(i<4) arr.add(Integer.parseInt(br.readLine()));
            else arr2.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        Collections.sort(arr2);

        for(int i=1; i<=3; i++){
            sum += arr.get(i);
        }
        sum+= arr2.get(1);
        System.out.println(sum);
    }
}
