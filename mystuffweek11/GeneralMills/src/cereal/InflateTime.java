package cereal;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.Calendar;
public class InflateTime{
    public static void main(String [] args){
	String filename = "time.ser";     
	if(args.length > 0){
	    filename = args[0];
	}
	PersistentTime time = null;
	FileInputStream fis = null;
	ObjectInputStream in = null;
	try{
	    fis = new FileInputStream(filename);
	    in = new ObjectInputStream(fis);
	    time = (PersistentTime)in.readObject();
	    in.close();
	}
	catch(IOException ex){
	    ex.printStackTrace();
	}
	catch(ClassNotFoundException ex){
	    ex.printStackTrace();
	}
	System.out.println("Flattened time: " + time.getTime());
	System.out.println("Current time: " + Calendar.getInstance().getTime());
    }
}
