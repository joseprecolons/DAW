import java.util.ArrayList;
import java.util.Iterator;

public class ProgramaVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vehicle vehicle1 = new Terrestre("4325CDF", "modelX", 2);
		Vehicle vehicle2 = new Aquatic("4325CDF", "modelX", 392);
		Vehicle vehicle3 = new Aeri("4325CDF", "modelX", 34);
		Vehicle vehicle4 = new Cotxe("4325CDF", "modelX", 4, true);
		Vehicle vehicle5 = new Moto("4325CDF", "modelX", 2, "naranja");
		Vehicle vehicle6 = new Submari("4325CDF", "modelX", 200, 942);
		Vehicle vehicle7 = new Vaixell("4325CDF", "modelX", 160, true);
		Vehicle vehicle8 = new Helicopter("4325CDF", "modelX", 6, 2);
		Vehicle vehicle9 = new Avio("4325CDF", "modelX", 300, 32);
		
		ArrayList arrList = new ArrayList();
		
		arrList.add(vehicle1);
		arrList.add(vehicle2);
		arrList.add(vehicle3);
		arrList.add(vehicle4);
		arrList.add(vehicle5);
		arrList.add(vehicle6);
		arrList.add(vehicle7);
		arrList.add(vehicle8);
		arrList.add(vehicle9);
		
		Iterator it = arrList.iterator();
		
		int i = 0;
		while(it.hasNext()) {
			Object contigunt = it.next();
			System.out.println("Vehicle número " + (i+1) + "\n" + contigunt);
			i++;
		}
	}
}
