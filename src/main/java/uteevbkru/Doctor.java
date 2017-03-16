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
	public void workWithPatient(Patient A){
		A.usePrecs(this.givePresc());
		
		//	System.sleep(10);
	}
	public Prescription givePresc(){
		Prescription precs = new Prescription();
		return precs;
	}
}

