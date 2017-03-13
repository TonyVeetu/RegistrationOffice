package uteevbkru;

import java.util.Date;

public class Letter extends Paper{

	private String nameOfDoctor;
	private Date data;
	
	public Letter(String name){
		super(name);
	}
	
	public void setNameDoctor(String name){
		nameOfDoctor = name;
	}
	public void setData(Date d){
		data = d;
	}
//	public String getDecription(){
//		return "";
//	}
}
