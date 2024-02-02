
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> pack = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            pack.add(Integer.parseInt(st.nextToken()));
            one.add(Integer.parseInt(st.nextToken()));
        }

        int packMin = Collections.min(pack);
        int oneMin = Collections.min(one);

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(oneMin*n); // 가장 싼 낱개만

        int price = 0;
        for(int i=6;;i+=6){ //가장 싼 패키지만
            price += packMin;
            if(i>=n) break;
        }
        answer.add(price);
        price = 0;

        int k =0;
        for(k=6;k<n;k+=6){
            price += packMin;
        }
        for(int i=k-6; i<n; i++){
            price += oneMin;
        }
        answer.add(price);

        System.out.println(Collections.min(answer));

    }
}

