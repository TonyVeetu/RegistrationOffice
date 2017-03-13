package uteevbkru;

public class Patient extends People {
	
	public Letter let = null; 
	
	public Patient(String fname, String sname){
		super(fname, sname);
	}

	public Letter getLetter(){
		return let;
	}
	
	public void setLetter(Letter letter){
		let = letter;
	}
}
