package uteevbkru;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Letter extends Paper{

	private Doctor doc;
	private String  curStringDate;
	private int hh = 0, mm = 0, ss = 0;
	
	public Letter(Doctor doctor){
		super(doctor.getName());
		doc = doctor;	
		Calendar c = Calendar.getInstance();		
		hh = c.get(Calendar.HOUR);
		mm = c.get(Calendar.MINUTE);
		ss = c.get(Calendar.SECOND);
	}

	public String getNameDoctor(){
		return doc.getName();
	}
	public String getStringData(){
		return curStringDate;
	}
	public int getHH(){		
		return hh;
	}
	public int getMM(){
		return mm;
	}
	public int getSS(){
		return ss;
	}
}
 