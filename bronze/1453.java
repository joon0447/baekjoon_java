import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> seatList = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int answer = 0;
        for(int i=0; i<n; i++){
            int wantSeat = Integer.parseInt(st.nextToken());
            if(seatList.contains(wantSeat)){
                answer++;
            }else{
                seatList.add(wantSeat);
            }
        }

        System.out.println(answer);
    }
}
