import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());

        Character[][] arr = new Character[row][col];

        for (int i = 0; i < row; i++) {
            String s = br.readLine();
            for (int k = 0; k < col; k++) {
                arr[i][k] = s.charAt(k);
            }
        }

        int r = 0;
        int c = 0;

        for(int i=0; i<row; i++){
            for(int k=0; k<col; k++){
                if(arr[i][k]=='X') break;
                if(k==col-1){
                    r++;
                }
            }
        }

        for(int i=0; i<col; i++){
            for(int k=0; k<row; k++){
                if(arr[k][i]=='X') break;
                if(k==row-1){
                    c++;
                }
            }
        }

        System.out.println(Math.max(r,c));
    }
}
