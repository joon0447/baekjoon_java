import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int num = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    queue.add(num);
                    break;
                case "pop":
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.poll()).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if(queue.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case "front":
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.peek()).append('\n');
                    break;
                case "back":
                    if(queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(num).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
