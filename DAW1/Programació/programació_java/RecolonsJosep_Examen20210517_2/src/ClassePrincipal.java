import java.util.ArrayList;

public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrList = new ArrayList();
		Personatge magB = new Mag("MagB", 240);
		
		arrList.add(new Mag("MagA", 200));
		arrList.add(new Clergue("ClergueA", 120, "Zeus"));
		arrList.add(new Poble("PobleA", 1, 70, 45));
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		System.out.println(magB);
		
		
		Personatge magA = (Mag) arrList.get(0);
		Personatge clergueA = (Clergue) arrList.get(1);
		Personatge pobleA = (Poble) arrList.get(2);
		
		((Mag) magA).aprendreConjura("conjur1");
		((Mag) magA).aprendreConjura("conjur2");
		((Mag) magB).aprendreConjura("conjur1");
		
		System.out.println(magA);
		System.out.println(magB);
		
		((Mag) magA).llencaConjura(magB);
		((Mag) magB).llencaConjura(magA);
		
		((Clergue) clergueA).curar(magB);
		
		((Mag) magA).llencaConjura(magB);
		((Mag) magB).llencaConjura(pobleA);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		System.out.println(magB);
		
		
	}

}
