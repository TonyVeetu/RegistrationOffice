package uteevbkru;

import java.util.ArrayList;

public class Prescription {
	private String presc;	
	ArrayList<String> tips = new ArrayList<String>();
	
	public Prescription(String name, String speciality){
		tips.add(name+", "+speciality+": Drink 1,5 litre of water!");
		tips.add(name+", "+speciality+": Clean teeth 2 time every day!");
		tips.add(name+", "+speciality+": Runnig 20 minutes every day!");
		tips.add(name+", "+speciality+": Eat 2 bananaz every day!");		
		int rand = (int)(Math.random()*4);
		presc = tips.get(rand);
	}
	public String getPresc(){
		if(presc != null)
			return presc;
		return "null";
	}
}
