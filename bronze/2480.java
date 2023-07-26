import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        Arrays.sort(arr, Collections.reverseOrder());
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);
        if(A==B && B==C){
            System.out.println(10000+A*1000);
        }else if(A==B || A==C){
            System.out.println(1000+A*100);
        }else if(B==C){
            System.out.println(1000+B*100);
        }else{
            System.out.println(A*100);
        }
    }
}

