import java.util.*;
public class ClassePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edat, edatj, edatv;
		int mitjanaedath, mitjanaedatd;
		int comptadorpersones, comptadorhomes, comptadordones;
		int sexe;
		
		mitjanaedath = 0;
		mitjanaedatd = 0;
		comptadorpersones = 0;
		comptadorhomes = 0;
		comptadordones = 0;
		edatv = 0;
		edatj = 0;
		Scanner teclatnum = new Scanner(System.in);
		Scanner teclatstring = new Scanner(System.in);
		
		
		do {
			System.out.print("Sexe home = 1, dona = 2: ");
			sexe = teclatstring.nextInt();
			System.out.print("Edat: ");
			edat = teclatnum.nextInt();
			
			if (edat < 0 && sexe != 1 && sexe != 2) {
				System.out.println("No es correcte");
			} else if (edat < 18) {
				System.out.println("No pots entrar");
			}	if (comptadorpersones == 0 && edat != 0) {
					edatv = edat;
					edatj = edat;
				} else if (edat > edatv) {
					edatv = edat;
				} else if (edat < edatj) {
					edatj = edat;
				}
				
				if (sexe == 1) {
					mitjanaedath = mitjanaedath + edat;
					comptadorhomes++;
				} else {
					mitjanaedatd = mitjanaedatd + edat;
					comptadordones++;
				}
				
				comptadorpersones++;
		} while (edat != 0);
		
		mitjanaedath = mitjanaedath / comptadorhomes;
		mitjanaedatd = mitjanaedatd / comptadordones;
		System.out.println("El numero total de persones es de " + comptadorpersones);
		System.out.println("El numero total d'homes es de " + comptadorhomes + " i de dones es de " + comptadordones);
		System.out.println("La mitjana de les edats dels homes es de " + mitjanaedath + " i la mitjana de edat de les dones es de " + mitjanaedatd);
		System.out.println("L'edat més gran es de " + edatv + "i la edat més jove es de " + edatj);
		
		teclatnum.close();
	}
}
