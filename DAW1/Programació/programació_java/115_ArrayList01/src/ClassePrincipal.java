import java.util.ArrayList;
import java.util.Iterator;

public class ClassePrincipal {
	
	public static void visualitzarLlistaIterant(ArrayList l) {
		Iterator i = l.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	
	public static int getUnitatsTotalsProducte(ArrayList l) {
		int unitatsTotals = 0;
		Iterator i = l.iterator();
		
		/*for (int j = 0; j < l.size(); j++) {
			if(l.get(j) instanceof Producte) {
				Producte tmb = (Producte) l.get(j);
				unitatsTotals += tmb.getQuantitat();
			}
		}*/
		
		while(i.hasNext()) {
			Object contigunt = i.next();
			if(contigunt instanceof Producte) {
				Producte tmb = (Producte) contigunt;
				unitatsTotals += tmb.getQuantitat();
			}
		}
		
		return unitatsTotals;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrList = new ArrayList();
		
		arrList.add("El primer valor");
		
		System.out.println(arrList.get(0));
		System.out.println("La dimensió actual de la meva llista és" + arrList.size());
		
		arrList.add(27);

		System.out.println(arrList.get(1));
		System.out.println("La dimensió actual de la meva llista és" + arrList.size());
		
		arrList.add(1, "Valor 2");
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("Posició " + i + " = " + arrList.get(i));
		}
		
		arrList.remove(1);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("Posició " + i + " = " + arrList.get(i));
		}
		
		arrList.add(new Producte("Producte1", 10));
		arrList.add(new Producte("Producte2", 5));
		arrList.add(new Producte("Producte3", 20));
		arrList.add(new Producte("Producte4", 7));
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println("Posició " + i + " = " + arrList.get(i));
		}
		
		visualitzarLlistaIterant(arrList);
		
		int unitatsTotals = getUnitatsTotalsProducte(arrList);
		
		System.out.println(unitatsTotals);
	}

}
