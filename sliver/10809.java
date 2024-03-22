import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            int index = (int)ch - 97;
            if(arr[index]==-1){
                arr[index] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int a : arr){
            sb.append(a + " ");
        }

        System.out.println(sb);
    }

}
