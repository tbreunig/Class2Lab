package lab4.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tyler
 */
public class WelcomeService {

    private Date dateAndTime;
    private String timeStamp;
    private String timeOfDay = "";

    //Was playing with alternative ways to validate between time periods of a 
    //day for the welcome message.
//    private Pattern pattern;
//    private Matcher matcher;
//    private static final String timeRegex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
    public WelcomeService() {
        calculateTimeOfDay();
    }

    public final Date getDateAndTime() {

        if (dateAndTime == null) {
            this.dateAndTime = new Date();

            dateAndTime = Calendar.getInstance().getTime();
            DateFormat formatter = new SimpleDateFormat("h:mm a z");
            timeStamp = formatter.format(dateAndTime);

        }
        return dateAndTime;

    }

    public final void setDateAndTime(Date dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public final String calculateTimeOfDay() {

        Calendar time = Calendar.getInstance();
        time.setTime(this.getDateAndTime());
        Calendar dawn = Calendar.getInstance();
        dawn.set(Calendar.HOUR_OF_DAY, 0);
        Calendar midDay = Calendar.getInstance();
        midDay.set(Calendar.HOUR_OF_DAY, 12);
        Calendar dusk = Calendar.getInstance();
        dusk.set(Calendar.HOUR_OF_DAY, 17);

        if (time.before(midDay)) {
            timeOfDay = "morning";
        } else if (time.after(dusk)) {
            timeOfDay = "evening";
        } else {
            timeOfDay = "afternoon";
        }
        return timeOfDay;
    }

    public final String getSalutation(String name) {
        String salutation = "Hello, " + name + "!" + " The time is now "
                + timeStamp + "." + " It's a wonderful "
                + calculateTimeOfDay() + "!";

        return salutation;
    }

    //Method for testing purposes
    public static void main(String[] args) {
        WelcomeService ws = new WelcomeService();
        Object obj = ws.getDateAndTime();
        String t = obj.toString();
        System.out.println(ws.getSalutation("Tyler"));
    }
}
