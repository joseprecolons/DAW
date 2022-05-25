package RecolonsJosep;

import java.util.ArrayList;
import java.util.Iterator;

public class Biblioteca {
	private int capacitat;
	ArrayList<Fitxa> elements = new ArrayList();
	
	Biblioteca(int capacitatR) {
		this.capacitat = capacitatR;
	}
	
	public int capacitat() {
		return this.capacitat;
	}

	public int nreElements() {
		return elements.size();
	}
	
	public int afegir(Fitxa obj) {
		
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getReferencia().equals(obj.getReferencia())) {
				return i;
			}
		}
		
		if(elements.size() >= this.capacitat) {
			return -3;
		} else if(obj == null) {
			return -2;
		} else {
			elements.add(obj);
			return -1;
		}
	}
	
	public int cercar(String referenciaR) {
		for (int i = 0; i < elements.size(); i++) {
			if(elements.get(i).getReferencia().equals(referenciaR)) {
				return i;
			}
		}
		return -1;
	}
	
	public Fitxa extreure(String referenciaR) {
		Fitxa test = null;
		
		for (int i = 0; i < elements.size(); i++) {
			if(elements.get(i).getReferencia().equals(referenciaR)) {
				test = elements.get(i);
				elements.remove(i);
			}
		}
		
		return test;
	}
	
	public void visualitzar() {
		
		System.out.println("Contingut de la biblioteca");
		System.out.println("***************************");
		System.out.println("Capacitat.....: " + this.capacitat);
		System.out.println("Nre. Exemplars: " + this.nreElements());
		
		for (int i = 0; i < elements.size(); i++) {
			System.out.print("Exemplar " + i + ": ");
			System.out.println(elements.get(i));
		}
	}
}
