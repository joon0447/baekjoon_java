import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        Boolean[] filter = new Boolean[n];
        Arrays.fill(filter, true);
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split("");
            ArrayList<String> alp = new ArrayList<>();
            for(int k=0; k<arr.length; k++){
                if(alp.contains(arr[k]) && !alp.get(alp.size()-1).equals(arr[k])){
                    filter[i] = false;
                    break;
                }
                alp.add(arr[k]);
            }
        }

        for(boolean value  : filter){
            if(value) answer++;
        }
        System.out.println(answer);

    }
}
