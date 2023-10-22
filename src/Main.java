//Class - Format and parse dates in locale sensitive manner
import java.text.SimpleDateFormat;
//Class - Specific instance in time, millisecond precision
import java.util.Date;

class DisplayDateTime {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        }
    }
