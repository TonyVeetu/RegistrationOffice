package uteevbkru;

public class People {

	private String fName;
	private String sName;
	
	public People(String fname, String sname){
		fName = fname;
		sName = sname;
	}
		
	public String getName(){
		return fName + " "+ sName;
	}
}
