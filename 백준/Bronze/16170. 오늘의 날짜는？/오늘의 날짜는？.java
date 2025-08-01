import java.io.IOException;
import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) throws IOException {
        ZonedDateTime cur = ZonedDateTime.now();

        System.out.print(cur.getYear() + "\n" + cur.getMonthValue() + "\n" + cur.getDayOfMonth());
    }
}