package uteevbkru;

import java.util.ArrayList;

public class Prescription {
	private String presc;	
	ArrayList<String> tips = new ArrayList<String>();
	
	public Prescription(){
		tips.add("Drink 1,5 litre of water!");
		tips.add("Clean teeth 2 time every day!");
		tips.add("Runnig 20 minutes every day!");
		tips.add("Eat 2 bananaz every day!");		
		int rand = (int)(Math.random()*4);
		presc = tips.get(rand);
	}
	public String getPresc(){
		return presc;
	}
}
