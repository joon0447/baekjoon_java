import java.io.*;
import java.util.Collections;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {
        TreeMap<Character, Integer> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            s = s.replace(" ", "");
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            }
        }
        Integer max = Collections.max(map.values());
        StringBuilder sb = new StringBuilder();
        for(Character a : map.keySet()){
            if(map.get(a).equals(max)) sb.append(a);
        }
        System.out.println(sb);
    }
}
