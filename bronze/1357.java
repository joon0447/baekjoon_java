import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String x = st.nextToken();
        String y = st.nextToken();

        String rx = "";
        String ry = "";

        ArrayList<Character> xlist = new ArrayList<>();
        ArrayList<Character> ylist = new ArrayList<>();
        for(int i=0; i<x.length(); i++){
            xlist.add(x.charAt(i));
        }

        for(int i=0; i<y.length(); i++){
            ylist.add(y.charAt(i));
        }

        for(int i=0; i<2; i++){
            StringBuilder sb = new StringBuilder();
            if(i==0){
                Collections.reverse(xlist);
                for(int k=0; k<xlist.size(); k++){
                    sb.append(xlist.get(k));
                }
                rx = sb.toString();
            }else{
                Collections.reverse(ylist);
                for(int k=0; k<ylist.size(); k++){
                    sb.append(ylist.get(k));
                }
                ry = sb.toString();
            }
        }

        String rxry = String.valueOf(Integer.parseInt(rx) + Integer.parseInt(ry));

        StringBuffer sb = new StringBuffer(rxry);
        System.out.println(Integer.parseInt(sb.reverse().toString()));
    }

}
