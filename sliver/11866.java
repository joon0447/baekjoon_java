import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Boolean[] arr = new Boolean[n];

        for(int i=0; i<n; i++){
            arr[i] = true;
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        int total = 0;
        for(int i=0;;i++){
            int a = i%n;
            if(arr[a]){
                count++;
                if(count==k){
                    if(total == n-1){
                        sb.append(a+1);
                    }else{
                        sb.append(a+1 + ", ");
                    }
                    arr[a]= false;
                    count = 0;
                    total++;
                }
            }

            if(total == n) break;

        }

        System.out.println("<" + sb + ">");
    }
}
