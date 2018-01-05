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
        System.out.println("Valeur Gauche: " + gauche);
        System.out.println("Valeur Droite : " + droite);
        System.out.println("Valeur Somme gauche et droite");
        ajoutDroiteGauche(gauche, droite);
    }
	
	/**
	 * 
	 * Creation methode statique d'addition de 2 long
	 */
	 public static void ajoutDroiteGauche(long g,long d)
	 {
		gauche = gauche + droite;
	 }
	 
}
