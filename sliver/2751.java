import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(al);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<al.size(); i++){
            sb.append(al.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
