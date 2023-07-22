import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        for(int i=0; i<30; i++){
            arr[i] = i+1;
        }

        for(int i=0; i<28; i++){
            int a = Integer.parseInt(br.readLine());
            for(int j=0; j<arr.length; j++){
                if(a == arr[j]) arr = removeElement(arr, a);
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
