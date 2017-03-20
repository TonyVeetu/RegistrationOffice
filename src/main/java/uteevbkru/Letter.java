package uteevbkru;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Letter extends Paper{

	static final int add_sec = 1;
	static int count_let = 0;
	private Doctor doc;
	private String  curStringDate;
	private int hh = 0, mm = 0, ss = 0;
	
	public Letter(Doctor doctor){		
		super(doctor.getName());		
		count_let++;
		doc = doctor;	
		Calendar c = Calendar.getInstance();			 		
		createHHMMSS(c);
	}
	/**
	 * Задача: Время создания талона должно отличаться от предыдущего на count_let*add_sec;	 
	 */	
	private void createHHMMSS(Calendar c){
		hh = c.get(Calendar.HOUR);
		mm = c.get(Calendar.MINUTE);
		ss = c.get(Calendar.SECOND);
		if((ss+(count_let*add_sec) >= 60)){
			int ost = ss+(count_let*add_sec) - 60;
			mm +=1;
			ss = ost;
			if(mm == 60){
				mm = 0;
				hh += 1;
			}
			curStringDate = Integer.toString(hh)+":"+ Integer.toString(mm)+":" + Integer.toString(ss);	
		}
		else{
			curStringDate = Integer.toString(hh)+":"+ Integer.toString(mm)+":" + Integer.toString(ss+(count_let*add_sec));	
		}
		//Хорошо было бы потестировать!!!
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
 