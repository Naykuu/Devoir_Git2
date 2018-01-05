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
        
        
        //C'est pas bon mais ajout de deux instances de la classe coordonnees
        Coordonnes1 = new Coordonnees = 25;
        Coordonnes2 = new Coordonnees = 26;
        
        System.out.println("Valeur Coordonnes1 " + Coordonnees1);
        System.out.println("Valeur Coordonnes2 " + Coordonnees2);
        System.out.println("Valeur Coordonnes1 et 2 ");
        ajoutCoordonnees(Coordonnees1,Coordonnees2);
        
 
        
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
	 
	 /**
	  * 
	  *Ajout/somme de deux coordonnees 
	  */
	 
	 //Fonction qui ne fonctionne pas
	 public static void ajoutCoordonnees(Coordonnees,Coordonnees)
	 {
		 CoordonneesG = CoordonneesG + CoordonneesD;
	 }
		 
		
	 
}//end class
