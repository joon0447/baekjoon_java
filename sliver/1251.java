import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        ArrayList<String> list = new ArrayList<>();

        for(int i=2; i<a.length(); i++){
            for(int j=1; j<i; j++){
                StringBuilder sb1 = new StringBuilder(a.substring(0,j));
                StringBuilder sb2 = new StringBuilder(a.substring(j,i));
                StringBuilder sb3 = new StringBuilder(a.substring(i));
                String str1 = sb1.reverse().toString();
                String str2 = sb2.reverse().toString();
                String str3 = sb3.reverse().toString();
                list.add(str1+str2+str3);
            }
        }

        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
