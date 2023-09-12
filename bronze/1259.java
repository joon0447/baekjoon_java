import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=br.readLine()).equals("0")){
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0; i<s.length(); i++){
                list.add(s.charAt(i));
            }
            Collections.reverse(list);
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<list.size(); i++){
                sb.append(list.get(i));
            }
            if(s.equals(sb.toString())) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
