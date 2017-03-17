package uteevbkru;

public class Patient extends People implements Comparable<Patient>{
	
	
	private int medPolic;
	public Letter let = null; 
	private Prescription pr;
	
	public Patient(String fname, String sname, int medPolic){
		super(fname, sname);
		this.medPolic = medPolic;
	}
	public Letter getLetter(){
		return let;
	}	
	public void setLetter(Letter letter){
		let = letter;
	}
	public int getMedPolic(){
		return medPolic;
	}
	public void  usePrecs(Prescription A){
		pr = A;
	}
	public Prescription  getPrecs(){
		return pr; 
	}	
	public int compareTo(Patient b) {
		Letter let1 = b.getLetter();
		if(let != null && let1 != null){
			//TODO
//			if(let.getHH() < let1.getHH() || let.getMM() < let1.getMM() || let.getSS() < let1.getSS()){
//				return -1;
//			}
//			else if(let.getHH() == let1.getHH() && let.getMM() == let1.getMM() && let.getSS() == let1.getSS()){
//				return 0;
//			}
//			else{
//				return 1;
//			}
		}		
		return 0;
	}
}
