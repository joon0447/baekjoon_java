import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<9; i++){
            al.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(Collections.max(al));
        System.out.println(al.indexOf(Collections.max(al))+1);
    }
}
