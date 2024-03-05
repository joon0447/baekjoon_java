
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] a;
    static int count = 0;
    static boolean[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); // 정점 수
        int con = Integer.parseInt(br.readLine()); // 간선 수

        a = new ArrayList[n+1];
        visit = new boolean[n+1];

        for(int i=1; i<=n; i++){
            a[i] = new ArrayList<>();
        }

        for(int i=0; i<con; i++){
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            a[f].add(s);
            a[s].add(f);
        }

        System.out.println(dfs(1));


    }

    public static int dfs(int x){
        visit[x] = true;
        for(int y : a[x]){
            if(!visit[y]){
                count++;
                dfs(y);
            }
        }
        return count;
    }
}

