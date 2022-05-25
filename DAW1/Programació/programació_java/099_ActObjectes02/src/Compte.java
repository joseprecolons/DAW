public class Compte {
	
    private String titular;
    private double quantitat;
    
    public Compte(String nomTitularRebut) {
        this(nomTitularRebut, 0); // Sobrecarga
    }
 
    public Compte(String nomTitularRebut, double quantitatRebuda) {
        this.titular = nomTitularRebut;
        //Si la quantitatRebuta es menor que cero, el posem  a cero
        if (quantitatRebuda < 0) {
            this.quantitat = 0;
        } else {
            this.quantitat = quantitatRebuda;
        }
    }
 
    //GETTER
    public String getTitular() {
        return titular;
    }
 
    public double getQuantitat() {
        return quantitat;
    }

    //SETTER
    public void setTitular(String nomTitularRebut) {
        this.titular = nomTitularRebut;
    }
 
    public void setQuantitat(double quantitatRebuda) {
        this.quantitat = quantitatRebuda;
    }
 
    /*ingressar� una quantitat al compte.
     Si la quantitat �s negativa, no far� res.*/
    public void ingressar(double quantitatRebuda) {
        if(quantitatRebuda > 0){
            this.quantitat += quantitatRebuda;
            // this.quantitat = this.quantitat + quantitatRebuda;
        }
    }
 
    /**
     * retirar(double quantitatARetirar):
     *   retirar� una quantitat del compte.
     *   Si restant la quantitatARetirar al saldo,
     *   el saldo qued�s negatiu, la quantitat
     *   del compte passar� a ser 0.
     * @param quantitat
     */
    public void retirar(double quantitatARetirar) {
        if (this.quantitat - quantitatARetirar < 0) {
            this.quantitat = 0;
        } else {
            this.quantitat -= quantitatARetirar;
        }
    }
 
    /**
     * Retorna l'estat de l'objete
     */
    @Override
    public String toString() {
        return "El titular " + titular + " t� " + quantitat + " euros al seu compte";
    }
 
}