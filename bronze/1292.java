import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i=1; i<=b; i++){
            for(int j=0; j<i; j++){
                list.add(i);
            }
        }

        int answer = 0;
        for(int i=a-1; i<b;i++){
            answer += list.get(i);
        }
        System.out.println(answer);
    }
}
