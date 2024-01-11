import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)) map.put(num, map.get(num)+1);
            else map.put(num, 1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)) sb.append(map.get(num)).append(" ");
            else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}
