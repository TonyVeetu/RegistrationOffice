package uteevbkru;

import java.util.ArrayList;
import java.util.List;

public class Patient extends People implements Comparable<Patient>{
	
	static int MAX_LET_FOR_ONE_PATIENT = 2;
	private int cur_let = 0;
	private int medPolic;
	public List<Letter> listLet = new ArrayList<Letter>();
	//private Letter curLetter = null;
	private Prescription pr;
	
	public Patient(String fname, String sname, int medPolic){
		super(fname, sname);
		this.medPolic = medPolic;
	}
	//TODO как то не красиво пока!!!
	public Letter getLetter(){		
		cur_let--;
		Letter let = listLet.get(cur_let);
		//listLet.remove(cur_let);
		return let;
	}	
	//TODO
	public Letter useCurLetter(){
		return listLet.get(cur_let -1);
	}
	public void addLetter(Letter letter){
		listLet.add(letter);
		cur_let++;
		//curLetter = letter;
	}
	public int getMedPolic(){
		return medPolic;
	}
	public void  usePrecs(Prescription A){
		pr = A;
	}
	public Prescription  getPrescription(){
		return pr; 
	}	
	/**
	 *  Пациенты добавляются в очередь согласно времени в талоне!
	 */
	public int compareTo(Patient b) {//один навсегда!!!
		Letter let1 = b.useCurLetter();
		Letter let = listLet.get(cur_let - 1);
		if(let != null && let1 != null){
			int hh1 = let.getHH(); int mm1 = let.getMM(); int ss1 = let.getSS();
			int hh2 = let1.getHH(); int mm2 = let1.getMM(); int ss2 = let1.getSS();
			if(hh1 > hh2)
				return 1;
			else if(hh1 == hh2){
				if(mm1 > mm2)
					return 1;
				else if(mm1 == mm2){
					if(ss1 > ss2)
						return 1;						
					else if(ss1 == ss2)
						return 0;
					else
						return -1;
				}
				else
					return -1;
			}
			else
				return -1;			
		}		
		return 0;
	}
	
	public void getListOfLet(){
		for(Letter l : listLet){
			System.out.println(l.getNameDoctor()+" "+l.getStringData());
		}		
	}
}
