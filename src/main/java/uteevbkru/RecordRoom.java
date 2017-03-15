package uteevbkru;

import java.util.ArrayList;

public class RecordRoom {

	private ArrayList<Doctor> doctors;
	
	public RecordRoom(){
		
		doctors = new ArrayList<Doctor>();
	}
	public boolean addDoctor(Doctor A){
		return doctors.add(A);
	}
	public void giveLetter(Patient A){
		Letter let = new Letter(doctors.get(0));
		A.setLetter(let);
	}

}
