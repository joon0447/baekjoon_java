import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int hr = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());

        int total = hr * 3600 + min * 60 + sec;

        st = new StringTokenizer(br.readLine(), ":");
        int dhr = Integer.parseInt(st.nextToken());
        int dmin = Integer.parseInt(st.nextToken());
        int dsec = Integer.parseInt(st.nextToken());
        int dtotal = dhr * 3600 + dmin * 60 + dsec;

        int diff = dtotal - total;

        if(diff<0){
            diff = 86400 - Math.abs(diff);
        }

        String ahr = String.format("%02d", diff/3600);
        String amin = String.format("%02d", (diff%3600)/60);
        String asec = String.format("%02d", diff%3600%60);
        
        System.out.println(ahr + ":" + amin + ":" + asec);
    }
}
