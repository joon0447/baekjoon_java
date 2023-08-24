import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i=1; i<=5; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            max = Math.max(max, sum);
            map.put(i, sum);
        }

        for(int i : map.keySet()){
            if(map.get(i)==max){
                System.out.println(i + " " + max);
                break;
            }
        }

    }
}
