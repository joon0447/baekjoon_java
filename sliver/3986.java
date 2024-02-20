import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack;
        int answer = 0;
        for(int i=0; i<n; i++){
            stack = new Stack<>();
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                Character c = s.charAt(j);
                if(!stack.isEmpty() && stack.peek() == c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
                if(j==s.length()-1){
                    if(stack.isEmpty()) answer++;
                }
            }
        }
        System.out.println(answer);
    }
}