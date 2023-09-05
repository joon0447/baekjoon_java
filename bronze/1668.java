import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        StringBuilder sb = new StringBuilder();

        int count = 1;
        int first = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(first<list.get(i)){
                count++;
                first = list.get(i);
            }
        }
        sb.append(count).append("\n");
        Collections.reverse(list);
        count = 1;
        first = list.get(0);
        for(int i=1; i<list.size(); i++){
            if(first<list.get(i)){
                count++;
                first = list.get(i);
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}
