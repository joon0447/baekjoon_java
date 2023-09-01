import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long CSize = Long.parseLong(br.readLine());
        long count = 0;
        for(int i=0; i<n; i++){
            Long fileSize = Long.parseLong(st.nextToken());
            if (fileSize != 0){
                count += fileSize / CSize;
                if(fileSize % CSize != 0){
                    count++;
                }
            }
        }
        System.out.println(CSize * count);
    }
}
