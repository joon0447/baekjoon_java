    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            HashSet<Integer> set = new HashSet<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
                set.add(num);
            }
            ArrayList<Integer> list = new ArrayList<>(set);
            Collections.sort(list);

            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<list.size(); i++){
                map.put(list.get(i), i);
            }

            for(int i=0; i<n; i++){
                sb.append(map.get(arr[i])).append(" ");
            }
            System.out.println(sb);
        }

    }
