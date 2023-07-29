import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++) {
            StringBuilder sb = new StringBuilder();
            String[] arr = br.readLine().split("");
            String tmp = arr[0];
            sb.append(tmp);
            for(int j=1; j<arr.length; j++){
                if(!(tmp.equals(arr[j]))){
                    sb.append(arr[j]);
                    tmp = arr[j];
                }
            }
            System.out.println(sb);
        }
    }
}
