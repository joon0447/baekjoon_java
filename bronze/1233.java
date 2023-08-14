import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ml = new ArrayList<>();
        HashMap<Integer, Integer> m = new HashMap<>();


        for(int i=1; i<=a; i++){
            for(int k=1; k<=b; k++){
                for(int j=1; j<=c; j++){
                    al.add(i+k+j);
                    if(!m.containsKey(i+k+j)) m.put(i+k+j,1);
                }
            }
        }

        for(int i=0; i<al.size(); i++){
            int count = m.get(al.get(i))+1;
            m.put(al.get(i), count);
        }
        int max = Collections.max(m.values());

        for(Integer key : m.keySet()){
            if(m.get(key)==max){
                ml.add(key);
            }
        }
        System.out.println(Collections.min(ml));

    }
}
