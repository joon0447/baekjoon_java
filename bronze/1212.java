import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"000","001","010","011","100","101","110","111"};
        StringBuilder sb = new StringBuilder();
        String a = br.readLine();
        for(int i=0; i<a.length(); i++){
            int d = a.charAt(i) - '0';
            sb.append(arr[d]);
        }

        if(a.equals("0")) System.out.println(a);
        else{
            while(sb.charAt(0)=='0'){
                sb.deleteCharAt(0);
            }
            System.out.println(sb);
        }


    }
}
