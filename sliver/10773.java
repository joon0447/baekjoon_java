import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0) stack.add(num);
            else stack.pop();
        }

        for(int n : stack){
            answer += n;
        }

        System.out.println(answer);
    }
}
