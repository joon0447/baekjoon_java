import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        int a_col = a%4==0 ? a/4-1 : a/4;
        int a_row = a%4==0 ? 4 : a%4;
        int b_col = b%4==0 ? b/4-1 : b/4;
        int b_row  = b%4==0 ? 4 : b%4;
        int col = Math.max(a_col,b_col) - Math.min(a_col,b_col);
        int row = Math.max(a_row,b_row) - Math.min(a_row,b_row);
        System.out.println(col+row);


    }
}
