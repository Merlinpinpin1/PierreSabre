package personnages;


public class commer�ants extends Humain
{


	public commer�ants (int argent,String nom,String boisson)
	{
		super(argent,nom, "th�" ) ;
	}

	public void recevoir(int argent)
	{
		GagnerArgent(argent);
		parler ( argent + " sous ! Je te remercie g�n�reux donateur! ");
	}

	public int seFaireExtorquer()
	{
		int argent = getArgent();
		PerdreArgent(argent);
		parler ("J'ai tout perdu! Le monde est trop injuste... ");

		return argent;
	}

	public static void main(String[] args)
	{
		commer�ants Marco ;
		Marco = new commer�ants(15,"Marco","th�");

	}
	
	public String getNom ()
	{
		return getNom ();
	}
	
}