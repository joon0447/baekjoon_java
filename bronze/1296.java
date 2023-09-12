import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yeon = br.readLine();
        int[] y ={0,0,0,0};
        for(int i=0; i<yeon.length(); i++){
            Character c = yeon.charAt(i);
            if(c=='L') y[0]++;
            else if(c=='O') y[1]++;
            else if(c=='V') y[2]++;
            else if(c=='E') y[3]++;
        }
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            String s = br.readLine();
            int[] arr = {0,0,0,0};
            for(int k=0; k<s.length(); k++){
                Character c = s.charAt(k);
                if(c=='L') arr[0]++;
                else if(c=='O') arr[1]++;
                else if(c=='V') arr[2]++;
                else if(c=='E') arr[3]++;
            }
            int L = y[0]+arr[0];
            int O = y[1]+arr[1];
            int V = y[2]+arr[2];
            int E = y[3]+arr[3];
            int count = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100;
            map.put(s, count);
        }
        int max = Collections.max(map.values());
        for(String str : map.keySet()){
            if(map.get(str)==max){
                System.out.println(str);
                break;
            }
        }
    }

}
