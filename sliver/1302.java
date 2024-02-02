
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String str = br.readLine();
            if(!map.containsKey(str)){
                map.put(str, 1);
            }else{
                map.put(str, map.get(str)+1);
            }
        }

        int max = Collections.max(map.values());
        ArrayList<String> list = new ArrayList<>();
        for(String s : map.keySet()){
            if(map.get(s)==max){
                list.add(s);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}

