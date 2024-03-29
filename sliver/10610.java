import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
            sb.append(arr[i]);
        }

        if(sum%3!=0 || !arr[arr.length-1].equals("0")){
            System.out.println(-1);
            return;
        }

        System.out.println(sb);
    }
}
