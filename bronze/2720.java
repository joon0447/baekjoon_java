import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 25;
        int b = 10;
        int c = 5;
        int d = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int money = Integer.parseInt(br.readLine());
            sb.append(money/a+" ");
            money %= a;
            sb.append(money/b+" ");
            money %= b;
            sb.append(money/c+" ");
            money %= c;
            sb.append(money/d+"\n");
        }
        System.out.println(sb);

    }
}
