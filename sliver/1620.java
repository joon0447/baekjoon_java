import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String str;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int num;
        for(int i=0; i<n; i++){
            str = br.readLine();
            map1.put(str, i+1);
            map2.put(i+1, str);
        }

        for(int i=0; i<m; i++){
            str = br.readLine();
            if(49 <= str.charAt(0) && str.charAt(0) <= 57){
                sb.append(map2.get(Integer.parseInt(str))).append('\n');
            }else{
                sb.append(map1.get(str)).append('\n');
            }
        }
        System.out.println(sb);
    }
}
