import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> boxSize = new HashMap<>();
        int[] bookSize = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            boxSize.put(i, Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++){
            bookSize[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<m; i++){
            for(int key : boxSize.keySet()){
                if(boxSize.get(key)>=bookSize[i]){
                    boxSize.put(key, boxSize.get(key)-bookSize[i]);
                    break;
                }
            }
        }

        int answer = 0;
        for(int key : boxSize.keySet()){
            answer += boxSize.get(key);
        }
        System.out.println(answer);

    }
}
