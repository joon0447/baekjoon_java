import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] arr = new String[8][8];
        for(int i=0; i<8; i++){
            String[] arr2 = br.readLine().split("");
            for(int k=0; k<8; k++){
                arr[i][k] = arr2[k];
            }
        }

        int answer = 0;
        for(int i=0; i<8; i++){
            for(int k=0; k<8; k++){
                if(i%2==0){
                    if(k%2==0 && arr[i][k].equals("F")){
                        answer++;
                    }
                }else{
                    if(k%2!=0 && arr[i][k].equals("F")){
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
