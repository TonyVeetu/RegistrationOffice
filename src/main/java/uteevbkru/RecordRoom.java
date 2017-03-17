package uteevbkru;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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
		queDoc1 = new PriorityQueue<Patient>();
		queDoc2 = new PriorityQueue<Patient>();
		queDoc3 = new PriorityQueue<Patient>();
		queDoc4 = new PriorityQueue<Patient>();
		queDoc5 = new PriorityQueue<Patient>();
	}
	public boolean addDoctor(Doctor A){
		return doctors.add(A);
	}
	public void giveLetter(Patient A, int numberDoc){
		Letter let = new Letter(doctors.get(numberDoc));
		A.setLetter(let);		
		allLets.add(let);//Не нужно ли добавлять в let имя пациента????    
		switch(numberDoc){
			case(0): 
				queDoc1.add(A);
				break;
			case(1): 
				queDoc2.add(A);
				break;
			case(2): 
				queDoc3.add(A);
				break;
			case(3): 
				queDoc4.add(A);
				break;
			case(4): 
				queDoc5.add(A);
				break;
			default:
				System.out.println("*****__Default case in giveLetter__*****");
		}
		//TODO нужна статистика выподания цифр!!!! Что бы плотностЬ 	была равномерной!!!
		
	}
	public void createPatients(){
		List<String> fname = new ArrayList<String>();
		List<String> sname = new ArrayList<String>();
		fname.add("Max"); 
		fname.add("Igor");
		fname.add("Casha");
		fname.add("Anton");
		fname.add("Ivan");
		
		sname.add("Petrov");
		sname.add("Cidorov");
		sname.add("Kysin");
		sname.add("Dorn");
		sname.add("Ivanov");
		
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
		for(int u = 0; u < pats.size();u++){
			int rand =  (int) ((Math.random())*5);
			giveLetter(pats.get(u), rand);
		}
	}

}
