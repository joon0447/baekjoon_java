import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int answer = 0;
        ArrayList<Boolean> al = new ArrayList<Boolean>();
        for(int i=0; i<n; i++){
            for(int j=0; j<l; j++){
                al.add(true);
            }

            if(i!=n-1){
                for(int j=0; j<5; j++){
                    al.add(false);
                }
            }
        }

        while(answer<al.size()){
            if(al.get(answer) == false) {
                break;
            }
            answer += d;
        }
        System.out.println(answer);

    }
}
