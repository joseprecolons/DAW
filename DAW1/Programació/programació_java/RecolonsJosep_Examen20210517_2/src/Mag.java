
public class Mag extends PersonatgeIntel_ligencia{
	private static final int INTELLIGENCIA_DEFAULT = 18, FORSA_DEFAULT = 10;
	private String[] conjurs = new String [4];
	
	Mag(String nomR, int vidaR) {
		super(nomR, FORSA_DEFAULT, vidaR, INTELLIGENCIA_DEFAULT);
		for (int i = 0; i < conjurs.length; i++) {
			conjurs[i] = "";
		}
	}
	
	public void aprendreConjura(String conjurR) {
		for (int i = 0; i < conjurs.length; i++) {
			if (conjurs[i].equals("")) {
				conjurs[i] = conjurR;
				break;
			}
		}
	}
	
	public void llencaConjura(Personatge objP) {
		
		if (!(objP instanceof Poble)) {
			objP.setVida(objP.getVida() - 10);
			
			if (objP instanceof Mag) {
				((Mag) objP).setIntelligencia(((PersonatgeIntel_ligencia) objP).getIntelligencia() - 5);
			}
			
			for (int i = 0; i < conjurs.length; i++) {
				if (!(conjurs[i].equals(""))) {
					conjurs[i] = "";
					break;
				}
			}
		} else {
			System.out.println(" --- No pots atacar al poble --- \n");
		}
	}
	
	public String toString() {
		return super.toString()
				+ " -- Conjurs -- \n"
				+ "Conjur 1: " + conjurs[0] + "\n"
				+ "Conjur 2: " + conjurs[1] + "\n"
				+ "Conjur 3: " + conjurs[2] + "\n"
				+ "Conjur 4: " + conjurs[3] + "\n";
	}
}
