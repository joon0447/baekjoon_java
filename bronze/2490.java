import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0; j<4; j++){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr,Collections.reverseOrder());
            if(arr.get(0)==0) System.out.println("D");
            else if(arr.get(1)==0) System.out.println("C");
            else if(arr.get(2)==0) System.out.println("B");
            else if(arr.get(3)==0) System.out.println("A");
            else System.out.println("E");
        }

    }
}
