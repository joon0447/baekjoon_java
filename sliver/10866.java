import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            switch (str){
                case("push_front"):
                    num = Integer.parseInt(st.nextToken());
                    deque.addFirst(num);
                    break;
                case("push_back"):
                    num = Integer.parseInt(st.nextToken());
                    deque.addLast(num);
                    break;
                case("pop_front"):
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.pollFirst());
                    break;
                case("pop_back"):
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.pollLast());
                    break;
                case("size"):
                    System.out.println(deque.size());
                    break;
                case("empty"):
                    if(deque.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case("front"):
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.peekFirst());
                    break;
                case("back"):
                    if(deque.isEmpty()) System.out.println(-1);
                    else System.out.println(deque.peekLast());
                    break;
            }
        }
    }
}
