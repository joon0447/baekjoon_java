import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        Boolean bool;
        while((str = br.readLine()).charAt(0)!='.'){
            bool = true;
            Stack<Character> stack = new Stack<>();

            for(char c : str.toCharArray()){
                if(c=='(') stack.push('(');
                else if(c=='[') stack.push('[');

                else if(c==')'){
                    if(stack.isEmpty() || stack.pop() != '(' ){
                        System.out.println("no");
                        bool = false;
                        break;
                    }
                }else if(c==']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        System.out.println("no");
                        bool = false;
                        break;
                    }
                }
            }
            if(bool){
                if(stack.isEmpty()) System.out.println("yes");
                else System.out.println("no");
            }
        }

    }
}
