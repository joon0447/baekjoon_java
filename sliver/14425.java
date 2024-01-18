import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i=0; i<n; i++){
            map.put(br.readLine(), 0);
        }

        int num = 0;
        for(int i=0; i<m; i++){
            String s = br.readLine();
            if(map.containsKey(s)) map.put(s, map.get(s)+1);
        }

        for(String s : map.keySet()){
            num += map.get(s);
        }
        System.out.println(num);

    }
}
