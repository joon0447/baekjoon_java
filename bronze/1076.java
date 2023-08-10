import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        map.put("black", new ArrayList<>(Arrays.asList(0,1)));
        map.put("brown", new ArrayList<>(Arrays.asList(1,10)));
        map.put("red", new ArrayList<>(Arrays.asList(2,100)));
        map.put("orange", new ArrayList<>(Arrays.asList(3,1000)));
        map.put("yellow", new ArrayList<>(Arrays.asList(4,10000)));
        map.put("green", new ArrayList<>(Arrays.asList(5,100000)));
        map.put("blue", new ArrayList<>(Arrays.asList(6,1000000)));
        map.put("violet", new ArrayList<>(Arrays.asList(7,10000000)));
        map.put("grey", new ArrayList<>(Arrays.asList(8,100000000)));
        map.put("white", new ArrayList<>(Arrays.asList(9,1000000000)));

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        int a = Integer.parseInt(map.get(first).get(0).toString() + map.get(second).get(0).toString());
        long c =map.get(third).get(1);
        System.out.println(a*c);

    }
}
