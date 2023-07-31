import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[4];
        for(int i=0; i<4; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(arr[0]<arr[1] && arr[1]<arr[2] && arr[2]<arr[3]) System.out.println("Fish Rising");
        else if(arr[0]>arr[1] && arr[1]>arr[2] && arr[2]>arr[3]) System.out.println("Fish Diving");
        else if(arr[0]==arr[1] && arr[1]==arr[2] && arr[2]==arr[3]) System.out.println("Fish At Constant Depth");
        else System.out.println("No Fish");

    }
}
