import java.text.SimpleDateFormat;
import java.util.Calendar;

public class i1 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println( "Hello at : " + sdf.format(cal.getTime()) );

//add 1 12:49
//add 2 13:02

    }

}
