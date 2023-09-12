import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> cs = new ArrayList<>();
            for(int k=0; k<5; k++){
                cs.add(Integer.parseInt(st.nextToken()));
            }
            map.put(i, cs);
        }

        HashMap<Integer, Integer> count = new HashMap<>();
        for(int i=0; i<n; i++){
            int cCount = 0;
            ArrayList<Integer> l = map.get(i);
            for(int k=0; k<n; k++){
                if(i==k) continue;
                ArrayList<Integer> t = map.get(k);
                for(int j=0; j<5; j++){
                    if(l.get(j)==t.get(j)){
                        cCount++;
                        break;
                    }
                }
            }
            count.put(i, cCount);
        }

        int max = Collections.max(count.values());
        for(Integer a : count.keySet()){
            if(count.get(a)==max){
                System.out.println(a+1);
                break;
            }
        }

    }
}
