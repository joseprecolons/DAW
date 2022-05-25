import java.util.Scanner;

public class ClassePrincipal {
	
	public static int dadesUserInt(String demanarNum) {
		int num;
		Scanner teclat = new Scanner(System.in);
		
		System.out.println(demanarNum);
		num = teclat.nextInt();
		
		return num;
	}
	
	public static String dadesUserBinari(String demanarNum) {
		String num;
		Scanner teclatb = new Scanner(System.in);
		
		System.out.println(demanarNum);
		num = teclatb.nextLine();
		
		return num;
	}
	
	public static String numToBinari (int num) {
		String numBinari = "";
		int aux;
		
		while (num > 1) {
			
			aux = num%2;
			num = num/2;
			numBinari = aux + numBinari;
		}
		
		return num + numBinari;
	}
	
	public static int binariToNum (String num) {
		int numEnter = 0;
		
		for (int i = 0, j = num.length() - 1; i < num.length() - 1; i++, j--) {
			numEnter = numEnter + (Integer.parseInt(String.valueOf(num.charAt(i))) * ((int) Math.pow(2, num.length()-(j))));
		}
		
		return numEnter;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		String binari = "";
		String type;
		Scanner teclatS = new Scanner(System.in);
		
		System.out.println("Que vols passar, un enter o un binari?");
		type = teclatS.nextLine();
		
		if (type.equals("enter")) {
			String DemanarNum = ("Escriu el número que vols passar");
			num = dadesUserInt(DemanarNum);
		} else if (type.equals("binari")) {
			String DemanarNum = ("Escriu el número que vols passar");
			binari = dadesUserBinari(DemanarNum);
		} else {
			System.out.println("Error");
		}
		
		
		
		System.out.println("El número " + num + " en binari és: " + numToBinari(num));
		System.out.println("El número " + binari + " en binari és: " + binariToNum(binari));
		
	}

}
