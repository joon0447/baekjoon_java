import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] arr2 = new int[n-1];
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        for(int i=0; i<n-1; i++){
            arr2[i] = arr[i+1] - arr[i];
        }
        int diff = gcd(arr2);
        System.out.println(calc(arr, diff));
    }
    public static int calc(int[] arr, int diff){
        int answer = 0;
        for(int i=0; i<arr.length-1; i++){
            answer += (arr[i+1] - arr[i]) / diff - 1;
        }
        return answer;
    }
    public static int gcd(int[] arr){
        int result = arr[0];
        for(int i=1; i<arr.length; i++){
            result = gcd(result, arr[i]);
        }
        return result;
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
