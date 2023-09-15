import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int bj = 1, bm = 1;

        int count = 0;
        int group = 0;
        int last = 0;

        for(int i=1;;i++){
            last = count;
            count+=i;
            if(count>=x && last<=x) {
                group = i;
                break;
            }
        }

        if(group%2 != 0){
            bj = group;
            bm = (group+1)-group;
            for(int i=1; i<x-last; i++){
                bj--;
                bm++;
            }
        }else{
            bj = (group+1)-group;
            bm = group;
            for(int i=1; i<x-last; i++){
                bj++;
                bm--;
            }
        }

        System.out.println(bj+"/"+bm);
    }

}
