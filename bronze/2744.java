import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            if ((int) c >= 97) {
                arr[i] = arr[i].toUpperCase();
            } else if ((int) c >= 65) {
                arr[i] = arr[i].toLowerCase();
            }
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
