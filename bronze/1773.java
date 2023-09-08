import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            int sec = Integer.parseInt(br.readLine());
            list.add(sec);
        }

        for(int i=1; i<=c; i++){
            for(int k=0; k<list.size(); k++){
                if(i%list.get(k)==0){
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}
