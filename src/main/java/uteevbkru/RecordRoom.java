package uteevbkru;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class RecordRoom {

	private List<Doctor> doctors;
	private List<Patient> pats;
	
	private List<Letter> allLets;//Нужен ли этот список???
 	
	private Queue<Patient> queDoc1;
	private Queue<Patient> queDoc2;
	private Queue<Patient> queDoc3;
	private Queue<Patient> queDoc4;
	private Queue<Patient> queDoc5;
	
	public RecordRoom(){		
		doctors = new ArrayList<Doctor>();
		pats = new ArrayList<Patient>();
		allLets = new ArrayList<Letter>();
		queDoc1 = new PriorityQueue<Patient>();//LinkedList!!!
		queDoc2 = new PriorityQueue<Patient>();
		queDoc3 = new PriorityQueue<Patient>();
		queDoc4 = new PriorityQueue<Patient>();
		queDoc5 = new PriorityQueue<Patient>();
	}

	public void giveLetter(Patient P, int numberDoc){
		Letter let = new Letter(doctors.get(numberDoc));
		P.addLetter(let);				
		//TODO
		//allLets.add(let);//Не нужно ли добавлять в let имя пациента????    
		switch(numberDoc){
			case(0): 
				queDoc1.add(P);
				break;
			case(1): 
				queDoc2.add(P);
				break;
			case(2): 
				queDoc3.add(P);
				break;
			case(3): 
				queDoc4.add(P);
				break;
			case(4): 
				queDoc5.add(P);
				break;
			default:
				System.out.println("*****__Default case in giveLetter__*****");
		}		
	}
	public void createPatients(){
		List<String> fname = new ArrayList<String>();
		List<String> sname = new ArrayList<String>();
		fname.add("Max"); 
		fname.add("Igor");
//		fname.add("Sasha");
//		fname.add("Anton");
//		fname.add("Ivan");
		
		sname.add("Petrov");
		sname.add("Cidorov");
//		sname.add("Kysin");
//		sname.add("Dorn");
//		sname.add("Ivanov");
		
		for(int i = 0; i < fname.size();i++){
			for(int j = 0; j < sname.size();j++){
				pats.add(new Patient(fname.get(i),sname.get(j),(i*fname.size())+j));
			}
		}				
	}
	public void createDoctors(){
		doctors.add(new Doctor("Margarita", "Habahian", "Therapeutist"));
		doctors.add(new Doctor("Inna", "Ivanova", "Surgeon"));  
		doctors.add(new Doctor("Olga", "Markova", "Ohthalmologist"));
		doctors.add(new Doctor("Olga", "Markova", "Paediatrician"));
		doctors.add(new Doctor("Mssha", "Kotina", "otolaryngologist")); 
	}
	public void giveLetters(){
		for(int i = 0; i < Patient.MAX_LET_FOR_ONE_PATIENT; i++){
			for(int u = 0; u < pats.size();u++){
				int rand = (int) ((Math.random())*5);
				//System.out.println(rand);					
				giveLetter(pats.get(u), rand);
			}
		}
	}

	public void doctorsStartWork(){
		System.out.println("1: "+queDoc1.size());
		System.out.println("2: "+queDoc2.size());
		System.out.println("3: "+queDoc3.size());
		System.out.println("4: "+queDoc4.size());
		System.out.println("5: "+queDoc5.size());			
		Doctor doc1 = doctors.get(0);
		while(!queDoc1.isEmpty()){
			Patient pat = queDoc1.poll();		
			doc1.workWithPatient(pat);
			System.out.println("patient: "+pat.getName()+ " " + pat.getLetter().getStringData() +"; " +pat.getPrescription().getPresc()+"que 1");
		}
		Doctor doc2 = doctors.get(1);
		while(!queDoc2.isEmpty()){
			Patient pat = queDoc2.poll();		
			doc2.workWithPatient(pat);
			System.out.println("patient: "+pat.getName()+ " " + pat.getLetter().getStringData() +"; " +pat.getPrescription().getPresc()+"que 2");
		}
		Doctor doc3 = doctors.get(2);
		while(!queDoc3.isEmpty()){
			Patient pat = queDoc3.poll();			
			doc3.workWithPatient(pat);
			System.out.println("patient: "+pat.getName()+ " " + pat.getLetter().getStringData() +"; " +pat.getPrescription().getPresc()+"que 3");
		}
		Doctor doc4 = doctors.get(3);
		while(!queDoc4.isEmpty()){
			Patient pat = queDoc4.poll();		
			doc4.workWithPatient(pat);
			System.out.println("patient: "+pat.getName()+ " " + pat.getLetter().getStringData() +"; " +pat.getPrescription().getPresc()+"que 4");
		}
		Doctor doc5 = doctors.get(4);
		while(!queDoc5.isEmpty()){
			Patient pat = queDoc5.poll();			
			doc5.workWithPatient(pat);
			System.out.println("patient: "+pat.getName()+ " " + pat.getLetter().getStringData() +"; " +pat.getPrescription().getPresc()+"que 5");
		}
	}

	public void getSortListOfPatient(){
		class NameComparator implements Comparator<Patient> {
			public int compare(Patient a, Patient b){
				return a.getName().compareTo(b.getName());
			}
		};//локальный вн класс!!
		Set<Patient> sortcol = new TreeSet<Patient>(new NameComparator());
		sortcol.addAll(pats);		
		for(Patient pr: sortcol){
			System.out.println("patient: "+pr.getName());
		}
	}
	
	public void getListLetForPatient(int i){
		pats.get(i).getListOfLet();
	}

	public void printPatientInQueue(){
		for(int i = 0; i < queDoc3.size(); i++){				
			Patient p = queDoc3.peek();
			System.out.println(p.getName() + " que3");
		}
		for(int i = 0; i < queDoc1.size(); i++){				
			Patient p = queDoc1.peek();
			System.out.println(p.getName() + " que1");
		}
		for(int i = 0; i < queDoc2.size(); i++){				
			Patient p = queDoc2.peek();
			System.out.println(p.getName() + " que2");		}
		for(int i = 0; i < queDoc4.size(); i++){				
			Patient p = queDoc4.peek();
			System.out.println(p.getName()+" que4");
		}
	}
}
