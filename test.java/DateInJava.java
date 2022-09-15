import java.time.LocalDate;
import java.util.Date;

public class DateInJava {
    public static void main(String[] args) {
        LocalDate lDate = LocalDate.now();
        String yesterday = "2017-10-10";

//        System.out.println(LocalDate.parse(yesterday)); covert String to date

        System.out.println(lDate);
    }
}
