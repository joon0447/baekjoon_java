import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('-', 0);
        map.put('\\', 1);
        map.put('(', 2);
        map.put('@', 3);
        map.put('?', 4);
        map.put('>', 5);
        map.put('&', 6);
        map.put('%', 7);
        map.put('/', -1);
        while(!(s=br.readLine()).equals("#")){
            int answer = 0;
            for(int i=0; i<s.length(); i++){
                int a = map.get(s.charAt(i));
                int pow = (int) Math.pow(8, s.length()-i-1);
                answer += a*pow;
            }
            System.out.println(answer);
        }
    }
}
