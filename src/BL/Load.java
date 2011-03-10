package BL;

import Persistance.Etape;
import Persistance.SaveBD;


public class Load
{
	// ////////////////////////////
	// D�claration des variables : //
	// ///////////////////////////
	
	private String UI_Load; //Stock le type d'interface souhait�e (graphique ou ligne de commande)
	private String save_Load; // Stock le type de suavegarde souhait�e (par base de donn�es ou par fichier texte)
	private String code_Etape_Load; // Stock le code de l'�tape a charger.
	private SaveBD save;
	

	// /////////////////////////////
	// Constructor : //
	// ////////////////////////////
	
	public Load (String UI, String save, String code_Etape) 
	{
		this.UI_Load = UI;
		this.save_Load = save;
		this.code_Etape_Load = code_Etape;
		
		type_Save();
	}
	
	
	// /////////////////////////////
	// M�thode: //
	// ////////////////////////////
	
	// M�thode de choix de la sauvegarde des donn�es
	public void type_Save()
	{System.out.println(this.save_Load);
		if(this.save_Load.equals("BDD"))
		{System.out.println("jE VAIS cr�ER le truc depuis la bdd =) ");
			this.save = new SaveBD("select * from etape where code_etape = '" + this.code_Etape_Load + "'", "Chargement");
			System.out.println("BLA) ");
			// Cr�ation classe SaveBDD,
			//Cr�ation de toutes les classes (ECUE, UE, ...) par Save BDD
		}
		else
		{
			if(this.save_Load == "TXT")
			{
				// Cr�ation classe SaveTXT
				// Cr�ation de toutes les classes par SaveTXT
			}
		}
	}
	
	// M�thode de choix de l'interface de communication homme machine
	public void type_UI()
	{
		if(this.UI_Load == "Graphique")
		{
			// Cr�ation des interfaces graphique (les classe UI)
		}
		else
		{
			if(this.UI_Load == "Console")
			{
				// Cr�ation des classes permettant le fonctionnement du programme en mode console
			}
		}
	}
	
	// /////////////////////////////
	// Accesseurs : //
	// ////////////////////////////

	public void set_UI_Load(String UI)
	{
		this.UI_Load = UI;
	}
	public void set_save_Load_Load(String save)
	{
		this.save_Load = save;
	}
	public void set_code_Etape_Load(String code_Etape)
	{
		this.code_Etape_Load = code_Etape;
	}
	public String get_UI_Load()
	{
		return this.UI_Load;
	}
	public String get_save_Load_Load()
	{
		return this.save_Load;
	}
	public String get_code_Etape_Load()
	{
		return this.code_Etape_Load;
	}
	public Etape getEtapeLoad()
	{
		return this.save.getEtape();
	}

	public void setSave(SaveBD save)
	{
		this.save = save;
	}

	public SaveBD getSave() 
	{
		return this.save;
	}
}