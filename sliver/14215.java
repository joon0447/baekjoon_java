import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        int result = 0;
        Arrays.sort(arr);

//        while(true){
//            if(arr[2]>=arr[1]+arr[0]){
//                arr[2]--;
//            }else{
//                result = arr[0]+arr[1]+arr[2];
//                System.out.println(result);
//                return;
//            }
//        }
        if(arr[2]<arr[0]+arr[1]){
            result = arr[0]+arr[1]+arr[2];
        }else{
            arr[2] = arr[2]-(arr[0]+arr[1])+1;
            result = arr[0]+arr[1]+arr[2];
        }
        System.out.println(result);
    }
}
