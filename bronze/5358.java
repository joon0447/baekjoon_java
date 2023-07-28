import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringBuilder sb = new StringBuilder();
            String a = br.readLine();
            if(a == null) break;
            String[] s = a.split("");
            for(int i=0; i<s.length; i++){
                switch (s[i]){
                    case "i":
                        sb.append("e");
                        break;
                    case "I":
                        sb.append("E");
                        break;
                    case "e":
                        sb.append("i");
                        break;
                    case "E":
                        sb.append("I");
                        break;
                    default:
                        sb.append(s[i]);
                        break;
                }
            }
            System.out.println(sb);
        }
    }
}
