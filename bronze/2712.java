import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            double a = Double.parseDouble(arr[0]);
            if(arr[1].equals("kg")){
                System.out.println(String.format("%.04f", a*2.2046) + " lb");
            }else if(arr[1].equals("l")){
                System.out.println(String.format("%.04f", a*0.2642) + " g");
            }else if(arr[1].equals("lb")){
                System.out.println(String.format("%.04f", a*0.4536) + " kg");
            }else{
                System.out.println(String.format("%.04f", a*3.7854) + " l");
            }
        }

    }
}
