package personnages;

public class Ronin extends Humain

{
	private int honneur;

	public Ronin(int argent, String nom, String boisson) {
		super(argent, nom, boisson);
		this.honneur = 1;

	}

	public void donner(commerçants beneficiaire) {
		int don = (getArgent() / 100) * 10;
		parler(beneficiaire.getNom() + "prend ces " + don + "sous");
		beneficiaire.recevoir(don);
	}

	public static void main(String[] args) {
		Ronin Roro;
		Roro = new Ronin(60, "Roro", "shochu");

	}

	public void provoquer (Yakuza adversaire)
	{
		int Réputation1 = adversaire.getRéputation() ;
		int force = this.honneur + this.honneur ;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à  ce pauvre marchand!" );
		if (Réputation1 < force | Réputation1 == force )
		{
			int Yargent = adversaire.getArgent() ;
			GagnerArgent(Yargent);
			this.honneur=this.honneur+1;
			parler("Je t'ai eu petit yakusa!");
			adversaire.perdre();
		}
		else
		{

			this.honneur=this.honneur-1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			PerdreArgent(getArgent());
		}
	}
	
}