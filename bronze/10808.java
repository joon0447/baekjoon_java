import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String alp = br.readLine();
        for(int i=0; i<alp.length(); i++){
            int a = (int)alp.charAt(i);
            arr[a-97] += 1;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
