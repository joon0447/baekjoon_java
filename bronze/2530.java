import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int hr = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int sec = Integer.parseInt(arr[2]);
        int need_sec = Integer.parseInt(br.readLine());

        if(need_sec/3600>=1) {
            hr += need_sec / 3600;
            need_sec %= 3600;
        }
        if(need_sec/60>=1){
            min  += need_sec/60;
            need_sec %= 60;
        }
        sec+= need_sec;
        if(sec>=60){
            min += sec/60;
            sec %=60;
        }if(min>=60){
            hr += min/60;
            min %=60;
        }if(hr>=24){
            hr %=24;
        }

        System.out.println(hr + " " + min + " " + sec);
    }
}

