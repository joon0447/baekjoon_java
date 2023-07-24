import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] first = br.readLine().split("");
        for(int i=0; i<N-1; i++){
            String[] arr = br.readLine().split("");
            for(int j=0; j<arr.length; j++){
                String str = arr[j];
                String str2 = first[j];
                if(!str.equals(str2)){
                    first[j] = "?";
                }
            }
        }
        for(int i=0; i<first.length; i++){
            sb.append(first[i]);
        }
        System.out.println(sb);
    }
}

