import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        if(m<2){
            System.out.println("Before");
        }else if(m==2){
            if(d<18){
                System.out.println("Before");
            }else if(d==18){
                System.out.println("Special");
            }else{
                System.out.println("After");
            }
        }else{
            System.out.println("After");
        }
    }
}
