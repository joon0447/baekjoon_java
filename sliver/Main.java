    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int[] arr1 = new int[2];
            int[] arr2 = new int[2];
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr1[0] =  Integer.parseInt(st.nextToken());
            arr1[1] =  Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            arr2[0] =  Integer.parseInt(st.nextToken());
            arr2[1] =  Integer.parseInt(st.nextToken());

            int a = arr1[0]*arr2[1] + arr2[0]*arr1[1];
            int b = arr1[1] * arr2[1];

            int num = gcd(a,b);
            System.out.println(a/num + " " + b/num);
        }

        public static int gcd(int a, int b){
            if(b==0){
                return a;
            }
            return gcd(b, a % b);
        }
    }


