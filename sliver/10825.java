import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static class Student{
        String name;
        int kor;
        int eng;
        int math;

        public Student(String name, int kor, int eng, int math){
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Student> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Student(name, kor, eng, math));
        }

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.kor == s2.kor){
                    if(s1.eng == s2.eng){
                        if(s1.math == s2.math){
                            return s1.name.compareTo(s2.name);
                        }
                        return s2.math - s1.math;
                    }
                    return s1.eng - s2.eng;
                }
                return s2.kor - s1.kor;
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Student s : list){
            sb.append(s.name).append('\n');
        }

        System.out.println(sb);
    }
}

