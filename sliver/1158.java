import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for(int i=1; i<=n; i++){
            queue.add(i);
        }

        sb.append("<");
        while(!queue.isEmpty()){
            for(int i=0; i<k-1; i++){
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            if(queue.size()!=0) sb.append(", ");
            else sb.append(">");
        }
        System.out.println(sb);
    }
}
