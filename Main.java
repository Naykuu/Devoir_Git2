/**
 *
 * @author Naykuu
 * @version 1.0
 */
public class Main
{
	
	public long[] TabLongG = new long[1];
	public long[] TabLongD = new long[1];
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
        ajoutDroiteGauche(long gauche, long droite);
        TabLongD = 10;
        TabLongG = 20;
        System.out.println("Valeur Tableau gauche :" + TabLongG);
        System.out.println("Valeur Tableau gauche :" + TabLongD);
        System.out.println("Valeur SommeTableau gauche et droite");
        sommeTableau(TabLongG,TabLongD);
 
        
    }
	
	/**
	 * 
	 * Creation methode statique d'addition de 2 long
	 */
	 public static void ajoutDroiteGauche(long g,long d)
	 {
		gauche = gauche + droite;
	 }
	 
	 /**
	  * Somme case 0 tableau
	  */
	 public static sommeTableau(long TabG,long TabD)
	 {
		TabLongG[0] = TabLongG[0] + TabLongD[0];
	 }
	 
	 
}
