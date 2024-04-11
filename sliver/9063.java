import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arrX = new int[n];
        int[] arrY = new int[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrX);
        Arrays.sort(arrY);

        int answer = (arrX[arrX.length-1] -arrX[0]) * (arrY[arrY.length-1] - arrY[0]);
        System.out.println(answer);
    }
}
