
public class VehiclesPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehicleHerencia[] arrVehicles = new VehicleHerencia[10];
		
		arrVehicles[0] = new CocheHerencia("Vermell", "Mercedes", 200);
		arrVehicles[1] = new MotoHerencia("Blau", "Honda", 500);
		arrVehicles[2] = new VehicleHerencia("Groc", "Mercedes");
		arrVehicles[3] = new CocheHerencia("Gris", "Nissan", 120);
		arrVehicles[4] = new CocheHerencia("Blanc", "BMW", 170);
		arrVehicles[5] = new CocheHerencia("Negre", "Audi", 90);
		arrVehicles[6] = new CocheHerencia("Taronja", "Hyundai", 110);
		arrVehicles[7] = new MotoHerencia("Vermell", "Suzuki", 1000);
		arrVehicles[8] = new VehicleHerencia("Blanc", "Ducati");
		arrVehicles[9] = new MotoHerencia("Blanc", "Kawasaki", 1000);
		
		for (int i = 0; i < arrVehicles.length; i++) {
			switch (i) {
				case 1, 2, 3, 5, 8:
					arrVehicles[i].reparar();
					break;
			}
		}
		
		int contadorCoches = 0, contadorMotos = 0;
		int contadorCochesReparats = 0, contadorMotosReparades = 0;
		
		for (int i = 0; i < arrVehicles.length; i++) {
			if (arrVehicles[i] instanceof CocheHerencia) {
				contadorCoches++;
				if (arrVehicles[i].getReparat()) {
					contadorCochesReparats++;
				}
			} else if (arrVehicles[i] instanceof MotoHerencia) {
				contadorMotos++;
				if (arrVehicles[i].getReparat()) {
					contadorMotosReparades++;
				}
			}
		}
		
		System.out.println("La quantitat de Coches és de: " + contadorCoches + "\n"
				+ "D'aquests coches, " + contadorCochesReparats + " ja estan reparats \n"
				+ "La quantitat de Motos és de " + contadorMotos + "\n"
				+ "D'aquestes motos, " + contadorMotosReparades + " ja estan reparades.");
	}

}
