import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> arr = new ArrayList<>();
        ArrayList<Character> filter = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            arr.add(br.readLine().charAt(0));
            if(!filter.contains(arr.get(i))){
                filter.add(arr.get(i));
            }
        }
        Collections.sort(filter);

        for(int i=0; i<filter.size(); i++){
            int count = 0;
            for(int k=0; k<arr.size(); k++){
                if(arr.get(k)==filter.get(i)) {
                    count++;
                    if (count == 5) {
                        sb.append(arr.get(k));
                        break;
                    }
                }
            }
        }
        System.out.println(sb.length()==0 ? "PREDAJA" : sb);

    }
}
