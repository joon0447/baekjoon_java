import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.println(check(br.readLine()));
        }
    }

    public static String check(String s) {
        Stack<String> stack = new Stack<>();
        String[] arr = s.split("");
        for (int j = 0; j < arr.length; j++) {
            if (arr[j].equals("(")) {
                stack.push(arr[j]);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

