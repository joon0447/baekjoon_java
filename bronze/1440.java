import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        String time[] = new String[3];
        for(int i=0; i<3; i++){
            time[i] = st.nextToken();
        }
        
        int answer = 0;


        for(int i=0; i<3; i++){
            String tmp;
            for(int k=0; k<2; k++){
                if(Integer.parseInt(time[0])>=1 && Integer.parseInt(time[0])<=12){
                    if(Integer.parseInt(time[1])>=0 && Integer.parseInt(time[1])<=59){
                        if(Integer.parseInt(time[2])>=0 && Integer.parseInt(time[2])<=59){
                            answer++;
                        }
                    }
                }
                tmp = time[1];
                time[1] = time[2];
                time[2] = tmp;
            }

            tmp = time[0];
            time[0] = time[1];
            time[1] = time[2];
            time[2] = tmp;
        }

        System.out.println(answer);

    }
}
