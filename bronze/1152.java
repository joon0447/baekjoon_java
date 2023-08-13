import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        List<String> al = new ArrayList<>();

        for(String str : arr){
            al.add(str);
        }

        al.removeAll(Arrays.asList(""));

        System.out.println(al.size());
    }
}
