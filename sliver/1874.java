    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();

            int lastValue = 1;
            int num;
            for(int i=0; i<n; i++){
                num = Integer.parseInt(br.readLine());
                if(num >= lastValue){
                    for(int j=lastValue; j<=num; j++){
                        stack.push(j);
                        sb.append('+').append('\n');
                    }
                    lastValue = num+1;
                }
                else if(stack.peek() != num){
                    System.out.println("NO");
                    return;
                }

                stack.pop();
                sb.append('-').append('\n');
            }

            System.out.println(sb);
        }
    }


