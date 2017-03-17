package uteevbkru;

import java.text.SimpleDateFormat;

public class Letter extends Paper{

	private Doctor doc;
	private String  curStringDate;
	private int hh = 0, mm = 0, ss = 0;
	
	public Letter(Doctor A){
		super(A.getName());
		doc = A;
		long curTime = System.currentTimeMillis(); 
		curStringDate =  new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss").format(curTime);//EEEE, dd MMMM yyyy, hh:mm:ss.SSS a
		//hh
		//mm
		//ss
		
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
 