package Persistance;



//Cette classe structure permet de cr�er un couple {Code_etudiant, metion_etudiant} permettant aux classe UE, semestre et �tape de renvoyer l'admission, la non admission ou l'ACDJ des �l�ves.
public class Struct_mention 
{
	//////////////////////////////
	//D�claration des variables :     //
	/////////////////////////////
	
	private Etudiant monEtud; //Un objet Etudiant
	private String mention; //Un objet de type mention (acquis, non acquis, ACDJ)
	
	///////////////////////////////
	//Constructeur :                        //
	//////////////////////////////
	
	public Struct_mention( Etudiant e, String m)
	{
		this.monEtud = e;
		this.mention = m;
	}
	
	///////////////////////////////
	//Accesseurs :                           //
	//////////////////////////////
	
	public Etudiant getEtudiant()
	{
		return this.monEtud;
	}
	
	public String getMention()
	{
		return this.mention;
	}
	
	public void setEtudiant(Etudiant e)
	{
		this.monEtud = e;
	}
	
	public void setMention(String m)
	{
		this.mention = m;
	}
}
