package uteevbkru;

public class Doctor extends People {

	private String speciality;
	
	public Doctor(String fname, String sname, String spec){
		super(fname, sname);
		speciality = spec;
	}
	
	public String getName(){
		return super.getName() + " "+ speciality;
	}
	
}

