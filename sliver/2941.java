import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i=0; i<arr.length; i++){
            a = a.replace(arr[i], "a");
        }
        System.out.println(a.length());
    }
}
