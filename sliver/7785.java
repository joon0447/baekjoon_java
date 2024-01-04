import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i=0; i<n; i++){
            String[] s= br.readLine().split(" ");
            map.put(s[0], s[1]);
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet,Collections.reverseOrder());
        for(String name : keySet){
            if(map.get(name).equals("enter")){
                System.out.println(name);
            }
        }
    }
}
