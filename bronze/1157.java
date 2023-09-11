import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            if(!(map.containsKey(a))){
                map.put(a, 1);
            }else{
                map.replace(a, map.get(a)+1);
            }
        }

        int max = Collections.max(map.values());
        StringBuilder sb = new StringBuilder();
        for(char a : map.keySet()){
            if(map.get(a)==max){
                sb.append(a);
            }
        }

        if(sb.length()!=1){
            System.out.println("?");
        }else{
            System.out.println(sb);
        }
    }
}
