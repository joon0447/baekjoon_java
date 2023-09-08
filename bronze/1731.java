import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>() ;
        for(int i=0; i<n; i++){
            int now = Integer.parseInt(br.readLine());
            list.add(now);
        }

        int diff = list.get(1)-list.get(0);
        int diff2 = list.get(list.size()-1) - list.get(list.size()-2);
        if(diff == diff2){
            System.out.println(list.get(list.size()-1)+diff);
        }else{
            int div = list.get(1)/list.get(0);
            System.out.println(list.get(list.size()-1)*div);
        }
    }
}
