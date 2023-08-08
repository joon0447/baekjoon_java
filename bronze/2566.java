import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int[10][10];
        int max = 0;
        int x = 0, y=0;
        for(int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 9; k++) {
                arr[i][k] = Integer.parseInt(st.nextToken());
                if(max < arr[i][k]){
                    max = arr[i][k];
                    x = i;
                    y = k;
                }
            }
        }


        System.out.println(max);
        System.out.println((x+1) + " " + (y+1));

    }
}
