
public class Cotxe {
	
	//Constructor
	//Serveix per inicialitzar l'objecte, y es el primer que fará, per exemple per cridar base de dades etc..
	public Cotxe() {
		System.out.println("....creant l'objecte....");
	}
	
	//Definició atributs
		private String sMarca, sModel, sColor, sMatricula;
		
		//SETTERS Info que envíes
		public void setMarca(String marca) {
			sMarca = marca;
		}
		public void setModel(String model) {
			sModel = model;
		}
		public void setColor(String color) {
			sColor = color;
		}
		
		//----
		
		public void matricular() {
			int num = (int) ((Math.random() * 10000));
			sMatricula = String.valueOf(num);
			int[] lletres = new int [3];
			for (int i = 0; i < lletres.length; i++) {
				lletres[i] = (int) (Math.random()*(90 - 65 + 1) + 65);
			}
			
			for (int i = 0; i < lletres.length; i++) {
				sMatricula = sMatricula + String.valueOf(Character.toChars(lletres[i]));
			}
			
			
		}
		
		//GETTERS Info que rebs
		public String getMarca() {
			return sMarca;
		}
		
		public String getModel() {
			return sModel;
		}
		
		public String getColor() {
			return sColor;
		}
		
		public String getMatricula() {
			return sMatricula;
		}
		
		public void visualitzar() {
			System.out.println("Marca....: " + sMarca);
			System.out.println("Model....: " + sModel);
			System.out.println("Motor....: " + sColor);
			System.out.println("Matricula: " + sMatricula);
		}
}
