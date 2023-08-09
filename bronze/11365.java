import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String a = br.readLine();
            if(a.equals("END")) break;
            String[] arr = a.split("");
            StringBuilder sb = new StringBuilder();
            for(int i=arr.length-1; i>=0; i--){
                sb.append(arr[i]);
            }
            System.out.println(sb);
        }

    }
}
