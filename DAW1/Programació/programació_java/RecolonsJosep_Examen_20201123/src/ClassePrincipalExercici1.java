
public class ClassePrincipalExercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		int suma2 = 2, suma3 = 3;
		
		while (num < 1800) {
			num = num + suma2;
			System.out.print(num + ", ");
			num = num + suma3;
			if (num == 1800) {
				System.out.print(num + ".");
			} else {
			System.out.print(num + ", ");
			}
		}

	}

}
