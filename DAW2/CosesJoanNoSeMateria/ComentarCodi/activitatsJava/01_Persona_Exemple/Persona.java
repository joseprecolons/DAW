/**

 * Representa una persona que pot caminar i parlar.

 *

 * @author Joan Pardo

 * @version 1.0.0

 * @since 1.0.0

 */

public class Persona {



    /**

     * nom: És el <b>nom</b> de la persona.

     */

    public String nom;



    /**

     * cognom: És el <b>cognom</b> de la persona.

     */

    public String cognom;



    /**

     * nomComplet: És el <b>nom complet</b> de la persona, compost pel nom i el cognom.

     */

    private final String nomComplet;



    /**

     * posicio: És la <b>posició</b> a on es troba la persona.

     */

    private float posicio;



    /**

     * El constructor s'encarrega de generar una instància

     * amb el <b>nom</b>, el <b>cognom</b> i el <b>nom complet</b>

     * de la persona, a partir del nom i cognoms rebuts.

     *

     * @param nomRebut és el <b>nom</b> de la persona.

     * @param cognomRebut és el <b>cognom</b> de la persona.

     */

    public Persona(String nomRebut, String cognomRebut) {

        this.nomComplet = this.nom + " " + this.cognom;

        this.nom = nomRebut;

        this.cognom = cognomRebut;

    }



    /**

     * Modifica la posició de la persona.

     *

     * @param distanciaRecorreguda: és la <b>distància recorreguda</b>

     * (en <b>metres</b>) que ha recorregut la persona.

     */

    public void caminar(float distanciaRecorreguda) {

        this.posicio += moure(distanciaRecorreguda);

    }



    /**

     * Calcula la distància a moure. Les subclasses poden

     * sobreescriure aquest mètode.

     *

     * @param distanciaAMoure: és la <b>distància a moure</b>

     * (en <b>metres</b>).

     * @return distància modificada.

     */

    protected float moure(float distanciaAMoure) {

        return distanciaAMoure * 1.0f;

    }



    /**

     * Mostra un missatge per la pantalla.

     *

     * @param missatgeAMostrar: és el <b>missatge a mostrar</b>

     * per pantalla.

     */

    public void parlar(String missatgeAMostrar) {

        System.out.println(generarMissatge(missatgeAMostrar));

    }



    /**

      * Genera un missatge a partir de la cadena rebuda com

      * argument i la informació de la persona.

      *

      * @param <b>missatgeRebut</b> missatge a incloure.

      * @return missatge generat amb la informació de la

      * persona i el missatge rebut.

      */

    private String generarMissatge(String missatgeRebut) {

        return  nomComplet + " (" +

                posicio + " m): " +

                missatgeRebut;

    }

}