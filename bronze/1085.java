import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int w = Integer.parseInt(arr[2]);
        int h = Integer.parseInt(arr[3]);

        list.add(x);
        list.add(y);
        list.add(h-y);
        list.add(w-x);
        Integer min = Collections.min(list);
        System.out.println(min);
    }
}
