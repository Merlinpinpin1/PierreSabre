package personnages;


public class commerçants extends Humain
{


	public commerçants (int argent,String nom,String boisson)
	{
		super(argent,nom, "thé" ) ;
	}

	public void recevoir(int argent)
	{
		GagnerArgent(argent);
		parler ( argent + " sous ! Je te remercie généreux donateur! ");
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
		commerçants Marco ;
		Marco = new commerçants(15,"Marco","thé");

	}
	
	public String getNom ()
	{
		return getNom ();
	}
	
}