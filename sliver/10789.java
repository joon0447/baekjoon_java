
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[][] arr = new Character[5][15];
        int max = 0;
        for(int i=0; i<5; i++){
            String str = br.readLine();
            if(max < str.length()) max = str.length();
            for(int j=0; j<str.length(); j++){
                arr[i][j] = str.charAt(j);
            }
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i]!=null){
                    sb.append(arr[j][i]);
                }

            }
        }
        System.out.println(sb);
    }
}


