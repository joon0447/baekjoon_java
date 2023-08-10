import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int f = Integer.parseInt(br.readLine());
        for(int i=0; i<=9 ;i++){
            arr[arr.length-2] = String.valueOf(i);
            for(int k=0; k<=9;k++){
                StringBuilder sb = new StringBuilder();
                arr[arr.length-1]=String.valueOf(k);
                for(int j=0; j<arr.length; j++){
                    sb.append(arr[j]);
                }
                int num = Integer.parseInt(sb.toString());
                if(num%f==0){
                    System.out.println(arr[arr.length-2] + arr[arr.length-1]);
                    return;
                }
            }
        }
    }
}
