
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;



public class Student {
	private String nume;
	private ArrayList<Integer> note;
	private float medie;
	
	public Student(String nume) {
		this.nume = nume;
		note = new ArrayList();
	}

	public Student(String nume, ArrayList<Integer> note){
		this.nume = nume;
		this.note = new ArrayList();
		for(Integer n: note)
			this.addNota(n);
	}

	public float getMedie() {
		return medie;
	}

	public String getNume() {
		return nume;
	}
	
	public void addNota(int nota) {
		if(nota<=10 || nota>0)
			note.add(nota);
		
	}
	
	public int getNota(int i){
		if(this.note.size()==0)
			throw new IllegalArgumentException();
		if(i<0)
			throw new IllegalArgumentException();
		if(i>(this.note.size()-1))
			throw new IllegalArgumentException();
		return note.get(i);
	}
	
	public int nrDisciplinePromovate(){
		int nrDiscipline = 0;
		for(Integer n: note)
			if(n >= 5)
				nrDiscipline++;
		
		return nrDiscipline;
	}
	
	public void medieAritmetica(){
		if(this.note.size()==0)
			throw new IllegalArgumentException();
		float m = 0;
		for(Integer n: note)
			if(n >= 5)
			{
				if(Integer.MAX_VALUE-m<n) {
					throw new IllegalArgumentException();
				}else {
					m += n;
				}
			}
				
		if(this.nrDisciplinePromovate()==0)
		{
			this.medie=m;
		}else
		{
			this.medie = m / this.nrDisciplinePromovate();
		}
		
	}
	
	
	@Override
	public String toString() {
		String output = this.nume + " note: ";
		for(Integer n: note)
			output += n + " ";
		return output;
	}	
}
