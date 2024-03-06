import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<arr.length; i++){
            sort(arr);
        }

        System.out.println(count);

    }

    public static void sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            while(arr[i]>=arr[i+1]){
                arr[i]--;
                count++;
            }
        }
    }
}
