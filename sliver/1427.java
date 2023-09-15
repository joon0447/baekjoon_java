import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            list.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i));
        }

        System.out.println(sb);
    }
}
