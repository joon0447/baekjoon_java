import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        StringBuffer sb1 = new StringBuffer(a).reverse();
        StringBuffer sb2 = new StringBuffer(b).reverse();


        System.out.println(Integer.parseInt(sb1.toString())>Integer.parseInt(sb2.toString()) ? sb1 : sb2);
    }

}
