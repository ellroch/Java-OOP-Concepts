package cereal;

import java.io.Serializable;
import java.util.Date; 
import java.util.Calendar;
public class PersistentTime implements Serializable {
	public PersistentTime() { 
        time = Calendar.getInstance().getTime();
 	} 
	public Date getTime() { 
	  return time;  
	}  
	private Date time;                         
}