import java.util.Calendar;


public class Main {

    public static void main(String[] args){
        Calendar a = Calendar.getInstance();
        System.out.println(a.get(a.YEAR));
        System.out.println(a.get(a.MONTH)+1);
        System.out.println(a.get(a.DATE));
    }
}

