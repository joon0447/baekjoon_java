import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        map.put(3,0);
        map.put(4,0);
        map.put(5,0);
        map.put(69,0);
        map.put(7,0);
        map.put(8,0);

        for(int i=0; i<num.length(); i++){
            int a = Integer.parseInt(String.valueOf(num.charAt(i)));
            if(a==6 || a==9){
                map.replace(69, map.get(69)+1);
            }else{
                map.replace(a, map.get(a)+1);
            }
        }

        if(map.get(69)%2==0){
            map.replace(69, map.get(69)/2);
        }else{
            map.replace(69, map.get(69)/2+1);
        }
        
        int max = 0;
        for(int a : map.keySet()){
            if(map.get(a)>=max){
                max = map.get(a);
            }
        }
        System.out.println(max);
    }
}
