import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[4];
        boolean pass = false;
        for(int i=0; i<4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        for(int i=0; i<4; i++){
            if(x==arr[i]){
                System.out.println(i+1);
                pass = true;
            }
        }

        if(!pass){
            System.out.println(0);
        }
    }
}
