import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int[][] arr = new int[5][5];
    static boolean[][] bingo = new boolean[5][5];
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) { // 불러주는 값 넣기
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < 5; k++) {
                answer++;
                check(Integer.parseInt(st.nextToken()));
                isBingo();
            }
        }
    }
    public static void check(int num){
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(num == arr[i][j]){
                    bingo[i][j] = true;
                    return;
                }
            }
        }
    }

    public static void isBingo(){
        int count = 0;
        boolean check = true;
        for(int i=0; i<5; i++){ // 왼쪽 대각선 검사
            if(!bingo[i][i]){
                check = false;
                break;
            }
            if(i==4 && check){
                count++;
            }
        }

        check = true;
        for(int i=0; i<5; i++){ // 오른쪽 대각선 검사
            if(!bingo[i][4-i]){
                check = false;
                break;
            }
            if(i==4 && check){
                count++;
            }
        }


        for(int i=0; i<5; i++){ // 가로 검사
            check = true;
            for(int j=0; j<5; j++){
                if(!bingo[i][j]){
                    check = false;
                    break;
                }
                if(j==4 && check){
                    count++;
                    if(count == 3) exit();
                }
            }
        }

        for(int i=0; i<5; i++){
            check = true;
            for(int j=0; j<5; j++){
                if(!bingo[j][i]){
                    check = false;
                    break;
                }
                if(j==4 && check){
                    count++;
                    if(count == 3) exit();
                }
            }
        }

    }

    public static void exit(){
        System.out.println(answer);
        System.exit(0);
    }
}
