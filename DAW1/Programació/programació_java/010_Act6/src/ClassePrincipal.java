public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor;
		valor = -1;
		
		while (valor < 100) {
			valor = (valor + 1);
			System.out.println(valor);
		}
		
		while (valor >= 0) {
			System.out.println(valor);
			valor = (valor - 1);
		}
	}

}
