import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<3; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        int a = (int)Math.pow(arr.get(2),2);
        int b = (int)Math.pow(arr.get(1),2);
        int c = (int)Math.pow(arr.get(0),2);

        if(a==b+c) System.out.println(1);
        else if(a==b &b==c) System.out.println(2);
        else System.out.println(0);

    }
}
