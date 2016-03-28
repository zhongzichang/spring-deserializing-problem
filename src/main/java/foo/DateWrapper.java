package foo;

import java.util.Date;

/**
 * Created by zzc on 3/28/16.
 */

public class DateWrapper{
  private Date date;
  public DateWrapper(){
    date = new Date();
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
