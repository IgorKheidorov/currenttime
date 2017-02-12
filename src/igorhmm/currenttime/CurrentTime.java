package igorhmm.currenttime;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Class to determine current system time
 */
public class CurrentTime {
 11111111111222222
	
  /**
   * Returns current system time in given format
   * @param  timeFormat Desirable format for current time output
   * @return current time
   */
  static public String getTime(String timeFormat) {
  Calendar cal = Calendar.getInstance();
  SimpleDateFormat sdf = new SimpleDateFormat(timeFormat);
  return sdf.format(cal.getTime());
  }
}