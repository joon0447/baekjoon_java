import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int total;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==b && b==c ){
                total = 10000 + a*1000;
                arr.add(total);
            }else if(a==b || a==c){
                total = 1000 +a*100;
                arr.add(total);
            }else if(b==c){
                total = 1000 + b*100;
                arr.add(total);
            }else{
                total = Math.max(a,Math.max(b,c)) * 100;
                arr.add(total);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));

    }
}
