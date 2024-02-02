import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Boolean[] arr = new Boolean[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            if(Integer.parseInt(st.nextToken())==1){
                arr[i] = true;
            }else{
                arr[i] = false;
            }
        }
        int student = Integer.parseInt(br.readLine());
        for(int i=0; i<student; i++){
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if(gender == 1){
                for(int j=1; num*j<=n; j++){
                    arr[num*j] = !arr[num*j];
                }
            }else if(gender == 2){
                arr[num] = !arr[num];
                for(int j=1;;j++) {
                    if (num - j > 0 && num + j <= n) {
                        if (arr[num + j].equals(arr[num - j])) {
                            arr[num + j] = !arr[num + j];
                            arr[num - j] = !arr[num - j];
                        } else {
                            break;
                        }
                    }else{
                        break;
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(arr[i]){
                sb.append("1 ");
            }else{
                sb.append("0 ");
            }
            count++;
            if(count%20==0){
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}
