import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        switch (s){
            case "SONGDO":
                System.out.println("HIGHSCHOOL");
                break;
            case "CODE":
                System.out.println("MASTER");
                break;
            case "2023":
                System.out.println("0611");
                break;
            case "ALGORITHM":
                System.out.println("CONTEST");
                break;
            default:
                break;
        }
    }
}


