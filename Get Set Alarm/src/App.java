import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        alarm alm = new alarm();

        String userTime = sc.next();
        alm.setTime(userTime);
        String a = alm.getTime();

        while (true) {
            LocalDateTime myDateobj = LocalDateTime.now();
            DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("HH:mm");
            String formattedDate = myDateobj.format(myFormatter);
            System.out.println("Current Date: "+ formattedDate);

            if (a.equals(formattedDate)) {
                System.out.println("Time Got Matched");
                break;
            } else {
                System.out.println("Time Didn`t Matched");
            }
        }
    }
}

class alarm{
    private String Time;

    public void setTime(String time)
    {
        Time = time;
    }

    public String getTime()
    {
        return Time;
    }
}