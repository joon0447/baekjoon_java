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

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(br.readLine(), 1);
        }

        for(int i=0; i<m; i++){
            String str = br.readLine();
            if(map.containsKey(str)){
                map.put(str, map.get(str)+1);
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(String s : sortedMap.keySet()){
            if(map.get(s)==2){
                count++;
                sb.append(s).append('\n');
            }
        }
        System.out.println(count);
        System.out.println(sb);

    }
}
