package uteevbkru;

public class Patient extends People {
	
	
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
}
