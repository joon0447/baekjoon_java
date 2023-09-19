import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=666;;i++){
            if(String.valueOf(i).contains("666")){
                count++;
                if(n==count){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
