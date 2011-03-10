package Persistance;


import java.util.Vector;

//Classe contenant les atrtributs et m�thodes communnes � ECUE,, UE, semestre, Etape.
public class Structure
{
	//////////////////////////////
	//D�claration des variables :     //
	/////////////////////////////

	private String libelle; // Contient le libelle de la structure (ECUE math1, UE informatique, ...)
	private String code; // Contient le code de la structure (code ECUE, code Semestre, code UE,  code Etape)
	private Vector<Etudiant> liste_etudiant; // Contient la liste des �tudiants reli� � la structure
	private Vector<Struct_note> liste_moyenne; //Contient la liste des notes des �tudiants pour la structure (notes ECUE, moyenne UE, moyenne semestre, moyenne Etape)
	
	///////////////////////////////
	//Constructeur :                        //
	//////////////////////////////
	
	public Structure(String lib, String c)
	{
		this.code = c;
		this.libelle = lib;
		this.liste_etudiant =  new Vector<Etudiant>();
		this.liste_moyenne =  new Vector<Struct_note>();
	}


	// /////////////////////////////
	// M�thodes : //
	// ////////////////////////////

	//Renvoie le nombre d'�tudiant de la liste
	public int get_Nb_Etudiant()
	{
		return this.liste_etudiant.size();
	}

	//Ajoute une structure note (code_etudiant, note_etudiant) � la liste de note
	public void add_Note(Struct_note note) 
	{
		this.liste_moyenne.add(note);
	}
	
	//Ajoute ou modifie la note "note" de l'�tudiant "code" � la liste de note
	public void set_Note_Etudiant(String code, float note)
	{
		int i;
		
		//On recherche l'�tudiant ayant pour code_etudiant "code"
		for (i = 0; i < this.getListeMoyenne().size(); i++) 
		{
			if (this.getListeMoyenne().get(i).getEtud().getCode() == code) 
			{
				this.getListeMoyenne().get(i).setNote(note);
			}
		}
	}
	//Renvoie la note de l'etudiant "code".
	public float get_Note_Etudiant(String code)
	{
		int i=0;
		float note = -1; //Si la note n'est pas trouv�e on renvoie -1
		Vector<Struct_note> liste_note = this.getListeMoyenne(); //On r�cup�re la liste de note
		
		//On parcours la liste de note � la recherche de celle de l'�tudiant "code".
		while (i < liste_note.size() && note == -1)
		{
			if (liste_note.get(i).getEtud().getCode() == code)
			{
				note =  liste_note.get(i).getNote();
			}
			i++;
		}
		return note;
	}
	
	///////////////////////////////
	//Accesseurs :                           //
	//////////////////////////////
	
	public String getLibelle()
	{ 
		return this.libelle;
	}
	public String getCode()
	{ 
		return this.code;
	}
	public Vector<Etudiant> getListeEtudiant()
	{
		return this.liste_etudiant;
	}
	

	public Vector<Struct_note> getListeMoyenne()
	{
		return this.liste_moyenne;
	}
	
	//Modificateur
	public void setLibelle(String lib)
	{ 
		this.libelle = lib;
	}
	public void setCode(String c)
	{ 
		this.code = c;
	}
	public void setListeEtudiant(Vector<Etudiant> liste)
	{
		this.liste_etudiant = liste;
	}
	public void setListeMoyenne(Vector<Struct_note> liste)
	{
		this.liste_moyenne = liste;
	}
}
