import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        boolean first = true;
        boolean die = false;
        int o=0, w=0;
        while(true){
            if(first){
                StringTokenizer st = new StringTokenizer(br.readLine());
                o = Integer.parseInt(st.nextToken());
                w = Integer.parseInt(st.nextToken());
                first = false;
                if(o==0 && w==0) break;
            }
            StringTokenizer sst = new StringTokenizer(br.readLine());
            String act = sst.nextToken();
            int value = Integer.parseInt(sst.nextToken());
            if(act.equals("#")){
                count++;
                first = true;
                if(die){
                    System.out.println(count + " RIP");
                    die = false;
                    continue;
                }
                if(w>o/2 && w<o*2){
                    System.out.println(count + " :-)");
                } else{
                    System.out.println(count + " :-(");
                }
                continue;
            }
            if(act.equals("E")){
                w -= value;
                if(w<=0) {
                    die = true;
                }
            }else if(act.equals("F")){
                w += value;
            }
        }
    }
}
