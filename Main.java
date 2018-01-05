/**
 *
 * @author Naykuu
 * @version 1.0
 */
public class Main
{
	public long gauche = 155;
	public long droite = 200;
	
	/**
     * Constructeur d'objets de classe Main
     */
    public static void Main(String args[])
    {
        System.out.println(gauche);
        System.out.println(Droite);
    }
	
	/**
	 * 
	 * Creation methode statique 
	 */
	 public static void ajoutDroiteGauche()
	 {
		gauche = gauche + droite;
	 }
	 
}
