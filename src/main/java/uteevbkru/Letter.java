package uteevbkru;

import java.text.SimpleDateFormat;

public class Letter extends Paper{

	private Doctor doc;
	private String  curStringDate;
	
	public Letter(Doctor A){
		super(A.getName());
		doc = A;
		long curTime = System.currentTimeMillis(); 
		curStringDate =  new SimpleDateFormat("EEEE, dd MMMM yyyy, hh:mm:ss.SSS a").format(curTime);//dd.MM.yyyy.hh.mm.ss 
		//System.out.println("let "+curStringDate);
	}
	
	public String getNameDoctor(){
		return doc.getName();
	}
	public String getStringData(){
		return curStringDate;
	}

}
 